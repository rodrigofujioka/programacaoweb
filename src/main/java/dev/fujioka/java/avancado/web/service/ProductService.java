package dev.fujioka.java.avancado.web.service;

import dev.fujioka.java.avancado.web.domain.Product;
import dev.fujioka.java.avancado.web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService
        implements CrudInterface<Product> {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Optional<Product> save(Product entity) {
        return Optional.of(productRepository.save(entity));
    }

    @Override
    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public long count() {
        return productRepository.count();
    }
    
   /*Novos Métodos*/
    
    public List<Product> buscarProdutosOrderByCreation() {
    	return this.productRepository.buscarProdutosOrderByCreation();
    }

    public List<Product> buscarPorDescricao(String descricao) {
    	return this.productRepository.buscarPorDescricao(descricao);
    }

    public List<Product> buscarPorDescricaoIgnoreCase(String description) {
    	return this.productRepository.buscarPorDescricaoIgnoreCase(description);
    }

    public Product buscarPorId(Long id) {
    	return this.productRepository.buscarPorId(id);
    }

    public Date buscarDataUltimoUpdate(Long id) {
    	return this.productRepository.buscarDataUltimoUpdate(id);
    }

}