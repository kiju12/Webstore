package kni.webstore.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kni.webstore.model.Role;
import kni.webstore.model.User;
import kni.webstore.repository.UserRepository;
import kni.webstore.validate.UserRegistrationValidator;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("Nie znaleziono uzytkownika o podanym adresie email");
		}
		return new org.springframework.security.core.userdetails.User(
				user.getEmail(),
				user.getPassword(),
				mapRolesToAuthority(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthority(Collection<Role> roles) {
		return roles.stream()
				.map(role -> new SimpleGrantedAuthority(role.getName()))
				.collect(Collectors.toList());
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void save(UserRegistrationValidator registration) {
		User user = new User();
		user.setFirstName(registration.getFirstName());
		user.setLastName(registration.getLastName());
		user.setEmail(registration.getEmail());
		user.setPassword(passwordEncoder.encode(registration.getPassword()));
		user.setRoles(Arrays.asList(new Role("ROLE_USER")));
		userRepository.save(user);
	}

}
