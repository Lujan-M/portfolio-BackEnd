package com.portfolio.app.service;

import java.util.List;

import com.portfolio.app.models.Educacion;
import com.portfolio.app.models.Experiencia_Laboral;
import com.portfolio.app.models.Persona;
import com.portfolio.app.models.Proyectos;
import com.portfolio.app.models.Tecnologias;
import com.portfolio.app.models.User;

public interface IAppService {
    public List<User> getUsers();  
    public void saveUser(User user);
    public void deleteUser(Long id);
    public User findUser(Long id);

    public List<Educacion> getEducacions();  
    public void saveEducacion(Educacion educacion);
    public void deleteEducacion(Long id);
    public Educacion findEducacion(Long id);
    
    public List<Experiencia_Laboral> getExperiencia_Laboral();  
    public void saveExperiencia_Laboral(Experiencia_Laboral experiencia_laboral);
    public void deleteExperiencia_Laboral(Long id);
    public Experiencia_Laboral findExperiencia_Laboral(Long id);
    
    public List<Persona> getPersonas();  
    public void savePersona(Persona persona);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    
    public List<Proyectos> getProyectos();  
    public void saveProyectos(Proyectos proyecto);
    public void deleteProyectos(Long id);
    public Proyectos findProyectos(Long id);
    
    public List<Tecnologias> getTecnologias();  
    public void saveTecnologias(Tecnologias tecnologias);
    public void deleteTecnologias(Long id);
    public Tecnologias findTecnologias(Long id);
    
    
}