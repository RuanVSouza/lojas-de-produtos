package com.projetosRuanz.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosRuanz.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
