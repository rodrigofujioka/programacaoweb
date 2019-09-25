package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Repository
public interface ProductRepository
     extends JpaRepository<Product, Long> {

	/* 1 Criando a query*/
	/*Query do product*/
	
	List<Product> findProductByName(String name);
	List<Product> findProductById(Long id);
	List<Product> findByProductDescription(String description);
	List<Product> findByProductDtCreation( Date dtCreation);
	List<Product> findByProductDtUpdate( Date dtUpdate);
				
	
}
