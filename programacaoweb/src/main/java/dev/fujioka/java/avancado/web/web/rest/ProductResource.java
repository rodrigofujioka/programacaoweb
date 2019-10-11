package dev.fujioka.java.avancado.web.web.rest;

import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.fujioka.java.avancado.web.model.Product;

@RestController
@RequestMapping("/api")
public class ProductResource {

	List<Product> productList = new LinkedList<>();
	
	@GetMapping("/product")
	public List<Product> getProducts(){
		return productList;
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable long id) {
		return productList.stream().filter(product -> product.getId() == id).findFirst().get();
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> save(@Valid @RequestBody Product product){
		product.setId(productList.size() + 1l);
		productList.add(product);
		return ResponseEntity.ok(product);
	}	
}
