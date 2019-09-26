package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {

    List<User> findUserByFirstName(String name);

    @Query("select u from User u where u.firstName=:name")
    List<User> findByName(@Param("name") String name);
    
    @Query("SELECT u FROM User u WHERE u.login = :login")
	public User buscarPorLogin(String login);

	@Query("SELECT u FROM User u WHERE u.firstName like %:firstName%")
	public List<User> buscarPorFirstNameLike(String firstName);

	@Query("SELECT u FROM User u WHERE u.lastName like %:lastName%")
	public List<User> buscarPorLastNameLike(String lastName);

	@Query("SELECT u FROM User u WHERE u.firstName like %:firstName% and u.lastName like %:lastName%")
	public List<User> buscarPorNomeCompleto(String firstName, String lastName);

	@Query("SELECT u.dtCreation FROM User u WHERE u.id = :id")
	public Date pegarDataCriacao(Long id);

}