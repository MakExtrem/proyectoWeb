package com.saulociddev.springsecproject.controllers;

import com.saulociddev.springsecproject.entities.medico;
import com.saulociddev.springsecproject.repositories.medicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class medicoController {
    @Autowired
    private medicoRepository MedicoRepository;

    @GetMapping(value = "/medico")
    public List<medico> getMedico(){

        return MedicoRepository.findAll();
    }
    @PostMapping(value = "/medico/save")
    public String saveMedico(@RequestBody medico Medico){
    MedicoRepository.save(Medico);
        return "Medico Guardado";

    }

    @PutMapping(value = "/medico/update/{id}")
    public String updateMedico(@PathVariable int id, @RequestBody medico Medico){
        medico updateMedico = MedicoRepository.findById(id).get();
        updateMedico.setId_Especialidad(Medico.getId_Especialidad());
        updateMedico.setNombre(Medico.getNombre());
        updateMedico.setApellido(Medico.getApellido());
        updateMedico.setDni(Medico.getDni());
        updateMedico.setDireccion(Medico.getDireccion());
        updateMedico.setTelefono(Medico.getTelefono());
        updateMedico.setEmail(Medico.getEmail());
        updateMedico.setNumeroColegiatura(Medico.getNumeroColegiatura());
        updateMedico.setFechaNacimiento(Medico.getFechaNacimiento());
        MedicoRepository.save(updateMedico);
        return "Medico actualizado";
    }

    @PatchMapping(value = "/medico/disable/{id}")
    public String disableMedico(@PathVariable int id){
        medico disableMedico = MedicoRepository.findById(id).get();
        disableMedico.setActivo(0);
        MedicoRepository.save(disableMedico);
        return "El medico se desactivo";
    }
    @PatchMapping(value = "/medico/view/{id}")
    public  String viewMedico(@PathVariable int id){
        medico viewMedico = MedicoRepository.findById(id).get();
        viewMedico.setActivo(1);
        MedicoRepository.save(viewMedico);
        return "Se habilito al medico";
    }
    @DeleteMapping(value = "/medico/delete/{id}")
    public String deleteMedico(@PathVariable int id){
        medico deleteMedico = MedicoRepository.findById(id).get();
        MedicoRepository.delete(deleteMedico);
        return "El medico ha sido eliminado";
    }

}
