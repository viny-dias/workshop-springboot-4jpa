package com.projetoWeb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoWeb.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
