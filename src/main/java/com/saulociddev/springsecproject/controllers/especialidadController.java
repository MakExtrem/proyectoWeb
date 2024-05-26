package com.saulociddev.springsecproject.controllers;

import com.saulociddev.springsecproject.entities.especialidad;
import com.saulociddev.springsecproject.repositories.especialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class especialidadController {
    @Autowired
    private especialidadRepository EspecialidadRepository;

    @GetMapping(value = "/especialidad")
    public List<especialidad> getEspecialidad(){
        return EspecialidadRepository.findAll();

    }

    @PostMapping(value = "/especialidad/save")
    public String saveEspecialidad(@RequestBody especialidad Especialidad){
        EspecialidadRepository.save(Especialidad);
        return "Especialidad Creada";
    }
    @PutMapping(value = "/especilidad/udpate/{id}")
    public String updateEspecialidad(@PathVariable int id, @RequestBody especialidad Especialidad){
        especialidad updateEspecialidad = EspecialidadRepository.findById(id).get();
        updateEspecialidad.setNombre(Especialidad.getNombre());
        EspecialidadRepository.save(updateEspecialidad);
        return "Se actualizo la especialidad";
    }

    @PatchMapping(value = "/especialidad/disable{id}")
    public String disableEspecialidad(@PathVariable int id){
        especialidad disableEspecialidad = EspecialidadRepository.findById(id).get();
        disableEspecialidad.setActivo(0);
        EspecialidadRepository.save(disableEspecialidad);

        return "Se desactivo la Especilidad";
    }

    @PatchMapping(value = "/especialidad/view{id}")
    public String viewEspecialidad(@PathVariable int id) {
        especialidad viewEspecialidad = EspecialidadRepository.findById(id).get();
        viewEspecialidad.setActivo(1);
        EspecialidadRepository.save(viewEspecialidad);
        return "Se habilito la especialidad";
    }
    @DeleteMapping(value = "/especialidad/delete{id}")
    public String deleteEspecialidad(@PathVariable int id){
        especialidad deleteEspecialidad = EspecialidadRepository.findById(id).get();
        EspecialidadRepository.delete(deleteEspecialidad);
        return "Se elimino la Especialidad";
    }
}
