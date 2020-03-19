package br.lionani07.coursejpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.lionani07.coursejpa.entities.Product;
import br.lionani07.coursejpa.repositories.ProductRepository;
import br.lionani07.coursejpa.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id));
	}

}
