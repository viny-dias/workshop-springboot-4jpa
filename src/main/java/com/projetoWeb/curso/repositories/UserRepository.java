package com.projetoWeb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoWeb.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
