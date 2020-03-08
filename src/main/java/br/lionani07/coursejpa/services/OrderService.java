package br.lionani07.coursejpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.lionani07.coursejpa.entities.Order;
import br.lionani07.coursejpa.repositories.OrderRepository;
import br.lionani07.coursejpa.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id));
	}

}
