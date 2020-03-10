package br.lionani07.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lionani07.coursejpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,	Long> {

}
