package dev.fujioka.java.avancado.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.fujioka.java.avancado.web.model.Product;
import dev.fujioka.java.avancado.web.repository.ProductRepository;

public class ProductService implements CrudInterface<Product> {
	
	@Autowired
	private ProductRepository productRep;
	
	public List<Product> findAll(){
		return productRep.findAll();
	}
	
	@Override
	public Product save(Product entity) {
		return productRep.save(entity);
	}
	
	@Override
	public Product findById(long id) {
		return productRep.findById(id).get();
	}
	
	@Override
	public void delete(Product entity) {
		productRep.delete(entity);
	}
	
	@Override
	public void deleteById(long id) {
		productRep.findById(id);
	}
	
	@Override
	public long count() {
		return productRep.count();
	}
	
}
