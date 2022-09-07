package com.portfolio.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia_Laboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private Long id_experiencia;
    private String puesto;
    private String periodo;  
    private String logo;  
    private String descripcion;  
}
