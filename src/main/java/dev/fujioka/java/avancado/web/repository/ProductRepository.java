package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
     extends JpaRepository<Product, Long> {
}
