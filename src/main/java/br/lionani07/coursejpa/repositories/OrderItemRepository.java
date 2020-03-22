package br.lionani07.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lionani07.coursejpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
