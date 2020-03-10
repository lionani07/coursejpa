package br.lionani07.coursejpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.lionani07.coursejpa.entities.Category;
import br.lionani07.coursejpa.repositories.CategoryRepository;
import br.lionani07.coursejpa.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id));
	}

}
