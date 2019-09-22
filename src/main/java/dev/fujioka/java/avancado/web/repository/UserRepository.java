package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {

    List<User> findUserByFirstName(String name);

    @Query("select u from User u where u.firstName=:name")
    List<User> findByName(@Param("name") String name);

}