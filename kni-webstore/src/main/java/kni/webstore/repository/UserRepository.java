package kni.webstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kni.webstore.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByEmail(String email);
}
