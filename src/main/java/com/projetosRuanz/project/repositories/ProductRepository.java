package com.projetosRuanz.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosRuanz.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
