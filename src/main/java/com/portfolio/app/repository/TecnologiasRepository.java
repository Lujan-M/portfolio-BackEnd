package com.portfolio.app.repository;

import com.portfolio.app.models.Tecnologias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepository extends JpaRepository<Tecnologias, Long> {
    
}
