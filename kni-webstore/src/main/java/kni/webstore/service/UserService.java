package kni.webstore.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import kni.webstore.model.User;
import kni.webstore.validate.UserRegistrationValidator;


public interface UserService extends UserDetailsService{
	User findByEmail(String email);
	void save(UserRegistrationValidator registration);
}
