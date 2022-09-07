package com.portfolio.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private Long id_persona;
    private String nombre;
    private String apellido;
    private String titulo;
    private String acerca_de;
    private String linkedin;
    private String github;
    
}