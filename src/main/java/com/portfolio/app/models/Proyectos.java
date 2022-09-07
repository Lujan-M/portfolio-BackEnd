package com.portfolio.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private Long id_proyectos;
    private String titulo;
    private String descripcion;
    private String codigo_fuente;
    private String vista_proyecto;

}