package com.portfolio.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologias {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private Long id_tecnologias;
    private String nombre;
    private String nivel;
}
