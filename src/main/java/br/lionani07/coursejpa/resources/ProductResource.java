package br.lionani07.coursejpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.lionani07.coursejpa.entities.Product;
import br.lionani07.coursejpa.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<Product> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable Long id) {
		return service.findById(id);
	}

}
