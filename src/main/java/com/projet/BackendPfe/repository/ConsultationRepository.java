package com.projet.BackendPfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.BackendPfe.model.Consultation;


@Repository
public interface ConsultationRepository extends JpaRepository<Consultation,Long> {}