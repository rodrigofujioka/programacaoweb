package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository
     extends JpaRepository<Product, Long> {


	@Query("SELECT p FROM Product p ORDER BY dtCreation ASC")
	public List<Product> buscarProdutosOrderByCreation();
	
	@Query("SELECT p.dtUpdate FROM Product p WHERE p.id = :id")
	public Date buscarDataUltimoUpdate(Long id);
	
	@Query("SELECT p FROM Product p WHERE p.id = :id")
	public Product buscarPorId(Long id);
	
	@Query("SELECT p FROM Product p WHERE p.description like %:description%")
	public List<Product> buscarPorDescricao(String description);
	
	@Query("SELECT p FROM Product p WHERE lower(p.description) like lower(:description)")
	public List<Product> buscarPorDescricaoIgnoreCase(String description);

}
