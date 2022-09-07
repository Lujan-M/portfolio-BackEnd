package com.portfolio.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private Long id_usuarios;
    private String email;
    private String password;

    public Long getId() {
        return id_usuarios;
     }
     public void setId(Long id) {
        this.id_usuarios = id;
     }
     public String getEmail() {
        return email;
     }
     public void setEmail(String email) {
        this.email = email;
     }
     public String getPassword() {
        return password;
     }
     public void setPassword(String password) {
        this.password = password;
     }
     

}
