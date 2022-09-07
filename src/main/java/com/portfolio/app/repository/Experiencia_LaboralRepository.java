package com.portfolio.app.repository;

import com.portfolio.app.models.Experiencia_Laboral;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Experiencia_LaboralRepository extends JpaRepository<Experiencia_Laboral, Long> {
    
}