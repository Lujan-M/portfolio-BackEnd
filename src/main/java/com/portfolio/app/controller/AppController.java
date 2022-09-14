package com.portfolio.app.controller;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import com.portfolio.app.models.*;
import com.portfolio.app.service.IAppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;                                                                                                                                                                  

@RestController
public class AppController {

    @Autowired
    private IAppService Service;

/*Login */
    @GetMapping("/login")
    public List<User> getUsers() {
        try{
            return Service.getUsers();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }

    @PostMapping("/usuario")
    public String createUser(@RequestBody User user) {
        try {
         Service.saveUser(user);
            return "Usuario creado con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }
/*Educacion */
    @GetMapping("/educacion")
    public List<Educacion> getEducacions() {
        try{
            return Service.getEducacions();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    @PostMapping("/educacion")
    public String createEducacion(@RequestBody Educacion educacion) {
        try {
         Service.saveEducacion(educacion);
            return "Educación agregada con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @PutMapping("/educacion/{id}")
    public Educacion editEducacion(@PathVariable Long id, @RequestBody Educacion educacion)
    {
        Educacion educacion2 = Service.findEducacion(id);
        try {
            educacion2.setDuracion(educacion.getDuracion());
            educacion2.setInstituto(educacion.getInstituto());
            educacion2.setLogo(educacion.getLogo());
            Service.saveEducacion(educacion2);
            return educacion2;
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @DeleteMapping("/educacion/{id}")
    public String deleteEducacion (@PathVariable Long id){
        try {
            Service.deleteEducacion(id);
            return "Educación eliminada con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }
/*Experiencia Laboral */
    @GetMapping("/experiencia-laboral")
    public List<Experiencia_Laboral> getExperiencia_Laboral() {
        try{
            return Service.getExperiencia_Laboral();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }

    @PostMapping("/experiencia-laboral")
    public String createExperiencia_Laboral(@RequestBody Experiencia_Laboral experiencia_Laboral) {
        try {
            Service.saveExperiencia_Laboral(experiencia_Laboral);
            return "Experiencia agregada con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @PutMapping("/experiencia-laboral/{id}")
    public Experiencia_Laboral editExperiencia_Laboral(@PathVariable Long id, @RequestBody Experiencia_Laboral experiencia_Laboral)
    {
        Experiencia_Laboral eLaboral = Service.findExperiencia_Laboral(id);
        try {
            eLaboral.setLogo(experiencia_Laboral.getLogo());
            eLaboral.setPeriodo(experiencia_Laboral.getPeriodo());
            eLaboral.setPuesto(experiencia_Laboral.getPuesto());
            eLaboral.setDescripcion(experiencia_Laboral.getDescripcion());
            Service.saveExperiencia_Laboral(eLaboral);
            return eLaboral;
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @DeleteMapping("/experiencia-laboral/{id}")
    public String deleteExperiencia_Laboral (@PathVariable Long id){
        try {
            Service.deleteExperiencia_Laboral(id);
            return "Experiencia eliminada con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

/*Persona*/
    @GetMapping("/persona")
    public List<Persona> getPersona() {
        try{
            return Service.getPersonas();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }

    @PutMapping("/persona/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestBody Persona persona)
    {
        Persona persona2 = Service.findPersona(id);
        try {
            persona2.setNombre(persona.getNombre());
            persona2.setApellido(persona.getApellido());
            persona2.setTitulo(persona.getTitulo());
            persona2.setAcerca_de(persona.getAcerca_de());
            persona2.setGithub(persona.getGithub());
            persona2.setLinkedin(persona.getLinkedin());
            persona2.setBanner(persona.getBanner());
            persona2.setPerfil(persona.getPerfil());
            Service.savePersona(persona2);
            return persona2;
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

/*Proyectos*/
    @GetMapping("/proyectos")
    public List<Proyectos> getProyectos() {
        try{
            return Service.getProyectos();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    @PostMapping("/proyectos")
    public String createProyectos(@RequestBody Proyectos proyectos) {
        try {
         Service.saveProyectos(proyectos);
            return "Proyecto agregado con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @PutMapping("/proyectos/{id}")
    public Proyectos editProyectos(@PathVariable Long id, @RequestBody Proyectos proyectos)
    {
        Proyectos proyecto = Service.findProyectos(id);
        try {
            proyecto.setCodigo_fuente(proyectos.getCodigo_fuente());
            proyecto.setDescripcion(proyectos.getDescripcion());
            proyecto.setTitulo(proyectos.getTitulo());
            proyecto.setVista_proyecto(proyectos.getVista_proyecto());
            Service.saveProyectos(proyecto);
            return proyecto;
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @DeleteMapping("/proyectos/{id}")
    public String deleteProyectos (@PathVariable Long id){
        try {
            Service.deleteProyectos(id);
            return "Proyecto eliminado con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

/*Tecnologías */
    @GetMapping("/tecnologias")
    public List<Tecnologias> getTecnologias() {
        try{
            return Service.getTecnologias();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }

    @PostMapping("/tecnologias")
    public String createTecnologias(@RequestBody Tecnologias tecnologias) {
        try {
        Service.saveTecnologias(tecnologias);
            return "Proyecto agregado con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @PutMapping("/tecnologias/{id}")
    public Tecnologias editTecnologias(@PathVariable Long id, @RequestBody Tecnologias tecnologias)
    {
        Tecnologias tecnologia = Service.findTecnologias(id);
        try {
            tecnologia.setNivel(tecnologias.getNivel());
            tecnologia.setNombre(tecnologias.getNombre());
            Service.saveTecnologias(tecnologia);
            return tecnologia;
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

    @DeleteMapping("/tecnologias/{id}")
    public String deleteTecnologias (@PathVariable Long id){
        try {
            Service.deleteTecnologias(id);
            return "Proyecto eliminado con éxito.";    
        } catch (Exception e) {
                System.out.println(e);
        }
        return null;
    }

/*File Upload */
    @PostMapping("/file-upload")
    public String fileUp(@RequestParam("file") MultipartFile file) {
        try (InputStream inputStream = file.getInputStream()){
            Path path = Paths.get("src/main/resources/static/" + file.getOriginalFilename());
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
            return "Imagen almacenada exitosamente.";
        } catch (Exception e) {
            System.out.println(e);           
        }
        return null;
    }
}