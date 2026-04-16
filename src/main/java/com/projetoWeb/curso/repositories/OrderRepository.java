package com.projetoWeb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoWeb.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
