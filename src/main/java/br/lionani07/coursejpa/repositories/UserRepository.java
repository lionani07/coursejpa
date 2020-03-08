package br.lionani07.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lionani07.coursejpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
