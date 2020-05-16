package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
