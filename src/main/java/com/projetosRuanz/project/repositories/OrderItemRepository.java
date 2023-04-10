package com.projetosRuanz.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosRuanz.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
