package com.projetoWeb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoWeb.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
