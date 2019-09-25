package dev.fujioka.java.avancado.web.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dev.fujioka.java.avancado.web.domain.Product;
import dev.fujioka.java.avancado.web.domain.User;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
	
		//List<User> findUserByFirstName(String firstName);
		
		@Query("select u from User u where u.firstName=:name")
		List<User> findByFirstName(@Param("name") String name); 
		
		/*Query do user*/
		
		List<User> findUserById(Long id);
		List<User> findUserByLogin(String login);
		List<User> findUserByPassword(String password);
		List<User> findUserByFirstName(String firstName);
		List<User> findUserByLastName(String lastName);
}