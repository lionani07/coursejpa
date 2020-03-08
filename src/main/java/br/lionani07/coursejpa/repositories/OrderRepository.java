package br.lionani07.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lionani07.coursejpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
