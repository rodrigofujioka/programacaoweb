package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository
     extends JpaRepository<Product, Long> {


    public List<Product> findProductByName(String name);

    @Query("select p from Product p where p.id in (:lista)")
    public List<Product> listaProdutosPorId(
            @Param("lista") List<Integer> lista);

    //
}

