package dev.fujioka.java.avancado.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.fujioka.java.avancado.web.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
