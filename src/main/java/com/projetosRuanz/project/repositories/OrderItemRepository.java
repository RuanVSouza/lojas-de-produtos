package com.projetosRuanz.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosRuanz.project.entities.OrderItem;
import com.projetosRuanz.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
