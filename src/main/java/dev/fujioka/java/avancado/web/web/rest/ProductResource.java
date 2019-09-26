package dev.fujioka.java.avancado.web.web.rest;

import dev.fujioka.java.avancado.web.domain.Product;
import dev.fujioka.java.avancado.web.repository.ProductRepository;
import dev.fujioka.java.avancado.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductResource {

    @Autowired
    private ProductService productService;


    @GetMapping("/product")
    public List<Product> getProductList() {

        return productService.findAll();
    }


    @PostMapping("/product")
    public ResponseEntity<Product> save(
            @RequestBody Product product) {

        product = productService.save(product).get();

        return ResponseEntity.ok().body(product);
    }

    @PutMapping("/product")
    public ResponseEntity<Product> update(
            @RequestBody Product product) {

        product = productService.save(product).get();

        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/product")
    public ResponseEntity<String> delete(
            @RequestBody Product product) {

        productService.delete(product);
        return ResponseEntity.ok().body("Product excluded " + product.getId());
    }
    
 /*Novos Metodos*/
    
    @GetMapping("/product/{id}")
    public Product buscarPorId(@PathVariable Long id) {
    	return this.productService.buscarPorId(id);
    }

    @GetMapping(value="/product", params = "order")
    public List<Product> buscarProdutosOrderByCreation() {
    	return this.productService.buscarProdutosOrderByCreation();
    }

    @GetMapping(value="/product/descricao/{descricao}")
    public List<Product> buscarPorDescricao(@PathVariable String descricao) {
    	return this.productService.buscarPorDescricao(descricao);
    }

    @GetMapping(value="/product/descricao/{descricao}", params = "ignoreCase")
    public List<Product> buscarPorDescricaoIgnoreCase(@PathVariable String descricao) {
    	return this.productService.buscarPorDescricaoIgnoreCase(descricao);
    }

    @GetMapping("/product/{id}/dtUpdate")
    public Date buscarDataUltimoUpdate(@PathVariable Long id) {
    	return this.productService.buscarDataUltimoUpdate(id);
    }


}
