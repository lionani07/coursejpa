package br.lionani07.coursejpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.lionani07.coursejpa.entities.User;
import br.lionani07.coursejpa.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

}
