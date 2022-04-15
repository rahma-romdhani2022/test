package com.projet.BackendPfe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.BackendPfe.model.AdminDigitalManager;


	@Repository
	public interface AdminDigitalMangerRepository extends JpaRepository<AdminDigitalManager, Long>{
		
		Optional<AdminDigitalManager> findByUsername(String username);

		Boolean existsByUsername(String username);

		Boolean existsByEmail(String email);
		
		Optional<AdminDigitalManager> findByImage(String image);

	}


