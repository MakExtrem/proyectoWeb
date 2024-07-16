package com.saulociddev.springsecproject.controllers;

import com.saulociddev.springsecproject.entities.medico;
import com.saulociddev.springsecproject.entities.paciente;
import com.saulociddev.springsecproject.repositories.medicoRepository;
import com.saulociddev.springsecproject.services.medicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class medicoController {
    @Autowired
    private medicoRepository MedicoRepository;

    @Autowired
    private medicoService MedicoService;

    @GetMapping(value = "/medico")
    public List<medico> getMedico(){

        return MedicoRepository.findAll();
    }

    @GetMapping(value = "/medico/{id}")
    private Optional<medico> getOneMedico(@PathVariable int id){
        return MedicoRepository.findById(id);
    }


    @PostMapping(value = "/medico/save")
    public String saveMedico(@RequestBody medico Medico){
        Medico.setActivo(1);
        Medico.setFechaRegistro(Medico.setFechaSistema());
    MedicoRepository.save(Medico);
        return "Medico Guardado";

    }

    @GetMapping(value = "/medico/espe/{idEs}")
    public List<medico> getMedicoEspecialidad(@PathVariable int idEs){
        return MedicoService.getMedicoEspecialidad(idEs);
    }



    @PutMapping(value = "/medico/update/{id}")
    public String updateMedico(@PathVariable int id, @RequestBody medico Medico){
        medico updateMedico = MedicoRepository.findById(id).get();
        updateMedico.setNombre(Medico.getNombre());
        updateMedico.setApellido(Medico.getApellido());
        updateMedico.setDireccion(Medico.getDireccion());
        updateMedico.setTelefono(Medico.getTelefono());
        updateMedico.setEmail(Medico.getEmail());
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
