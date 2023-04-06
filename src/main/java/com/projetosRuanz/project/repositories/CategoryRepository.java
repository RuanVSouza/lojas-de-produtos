package com.projetosRuanz.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosRuanz.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
