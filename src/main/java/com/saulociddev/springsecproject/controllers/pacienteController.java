package com.saulociddev.springsecproject.controllers;

import com.saulociddev.springsecproject.entities.paciente;
import com.saulociddev.springsecproject.repositories.pacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class pacienteController {
    @Autowired
    private pacienteRepository PacienteRepository;

    @GetMapping(value = "/paciente")
    public List <paciente> getPaciente (){
        return PacienteRepository.findAll();
    }

    @PostMapping(value = "/paciente/save")
    public String savePaciente(@RequestBody paciente Paciente){
        PacienteRepository.save(Paciente);
        return "Paciente guardado";
    }
    @PutMapping(value = "/paciente/update/{id}")
    public String updatePaciente(@PathVariable int id,@RequestBody paciente Paciente ){
        paciente updatedPaciente= PacienteRepository.findById(id).get();
        updatedPaciente.setNombre(Paciente.getNombre());
        updatedPaciente.setApellido(Paciente.getNombre());
        updatedPaciente.setDni(Paciente.getDni());
        updatedPaciente.setTelefono(Paciente.getTelefono());
        updatedPaciente.setEmail(Paciente.getEmail());
        updatedPaciente.setFechaNacimiento(Paciente.getFechaNacimiento());
        updatedPaciente.setGenero(Paciente.getGenero());
        PacienteRepository.save(updatedPaciente);
        return "Se actualizo el Paciente";
    }

    @PatchMapping(value = "/paciente/disable/{id}")
    public String disablePaciente(@PathVariable int id){
        paciente disablePaciente= PacienteRepository.findById(id).get();
        disablePaciente.setActivo(0);
        PacienteRepository.save(disablePaciente);
        return "Se desabilito el Paciente";
    }

    @PatchMapping(value = "/paciente/view/{id}")
    public String viewPaciente(@PathVariable int id){
        paciente viewPaciente= PacienteRepository.findById(id).get();
        viewPaciente.setActivo(1);
        PacienteRepository.save(viewPaciente);
        return "Se habilito el Paciente";
    }
    @DeleteMapping(value = "/paciente/delete/{id}")
    public String deletePaciente(@PathVariable int id){
        paciente deletePaciente = PacienteRepository.findById(id).get();
        PacienteRepository.delete(deletePaciente);
    return "Paciente Borrado";
    }
}
