package com.portfolio.app.service;

import java.util.List;

import com.portfolio.app.models.Educacion;
import com.portfolio.app.models.Experiencia_Laboral;
import com.portfolio.app.models.Persona;
import com.portfolio.app.models.Proyectos;
import com.portfolio.app.models.Tecnologias;
import com.portfolio.app.models.User;
import com.portfolio.app.repository.EducacionRepository;
import com.portfolio.app.repository.Experiencia_LaboralRepository;
import com.portfolio.app.repository.PersonaRepository;
import com.portfolio.app.repository.ProyectosRepository;
import com.portfolio.app.repository.TecnologiasRepository;
import com.portfolio.app.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService implements IAppService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
        
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
        
    }
    @Override
    public User findUser(Long id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }
    
    @Autowired
    private EducacionRepository educacionRepository;
    @Override
    public List<Educacion> getEducacions() {
        List<Educacion> educacionList = educacionRepository.findAll();
        return educacionList;
    }
    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
        
    }
    @Override
    public void deleteEducacion(Long id) {
        educacionRepository.deleteById(id);
        
    }
    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = educacionRepository.findById(id).orElse(null);
        return educacion;
    }

    @Autowired
    private Experiencia_LaboralRepository experiencia_laboralRepository;
    @Override
    public List<Experiencia_Laboral> getExperiencia_Laboral() {
        List<Experiencia_Laboral> experiencia_laboralList = experiencia_laboralRepository.findAll();
        return experiencia_laboralList;
    }
    @Override
    public void saveExperiencia_Laboral(Experiencia_Laboral experiencia_laboral) {
        experiencia_laboralRepository.save(experiencia_laboral);
        
    }
    @Override
    public void deleteExperiencia_Laboral(Long id) {
        experiencia_laboralRepository.deleteById(id);
        
    }
    @Override
    public Experiencia_Laboral findExperiencia_Laboral(Long id) {
        Experiencia_Laboral experiencia_laboral = experiencia_laboralRepository.findById(id).orElse(null);
        return experiencia_laboral;
    }
    @Autowired
    private ProyectosRepository proyectosRepository;
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectosList = proyectosRepository.findAll();
        return proyectosList;
    }
    @Override
    public void saveProyectos(Proyectos proyectos) {
        proyectosRepository.save(proyectos);
        
    }
    @Override
    public void deleteProyectos(Long id) {
        proyectosRepository.deleteById(id);
        
    }
    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = proyectosRepository.findById(id).orElse(null);
        return proyectos;
    }
    @Autowired
    private TecnologiasRepository tecnologiasRepository;
    @Override
    public List<Tecnologias> getTecnologias() {
        List<Tecnologias> tecnologiasList = tecnologiasRepository.findAll();
        return tecnologiasList;
    }
    @Override
    public void saveTecnologias(Tecnologias tecnologias) {
        tecnologiasRepository.save(tecnologias);
        
    }
    @Override
    public void deleteTecnologias(Long id) {
        tecnologiasRepository.deleteById(id);
        
    }
    @Override
    public Tecnologias findTecnologias(Long id) {
        Tecnologias tecnologias = tecnologiasRepository.findById(id).orElse(null);
        return tecnologias;
    }
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> getPersonas() {
        List<Persona> personaList = personaRepository.findAll();
        return personaList;
    }
    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
        
    }
    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
        
    }
    @Override
    public Persona findPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
    }

}
