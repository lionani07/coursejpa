package br.lionani07.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lionani07.coursejpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
