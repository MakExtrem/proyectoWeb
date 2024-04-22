package com.saulociddev.springsecproject.controllers;

import com.saulociddev.springsecproject.entities.cita;
import com.saulociddev.springsecproject.repositories.citaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class citaController {
    @Autowired
    private citaRepository CitaRepository;

    @GetMapping(value = "/cita")
    private List<cita> getCita(){

        return CitaRepository.findAll();
    }

    @PostMapping(value = "/cita/save")
    private String saveCita(@RequestBody cita Cita){
        //Prueba
        Cita.setHoraAtencion(Cita.setHoraAtencionini());
        //prueba
        CitaRepository.save(Cita);
        return "Se guardo la cita";
    }
    @PutMapping(value = "/cita/update/{id}")
    private String updateCita(@RequestBody cita Cita ,@PathVariable int id){
        cita updateCita = CitaRepository.findById(id).get();
        updateCita.setId_Medico(Cita.getId_Medico());
        updateCita.setId_Paciente(Cita.getId_Paciente());
        updateCita.setFechaAtencion(Cita.getFechaAtencion());
        updateCita.setHoraAtencion(Cita.getHoraAtencion());
        updateCita.setObservaciones(Cita.getObservaciones());
        CitaRepository.save(updateCita);
        return "Se actualizo la cita";
    }
    @PatchMapping(value = "/cita/disable/{id}")
    public String disableCita (@PathVariable int id){
        cita disableCita = CitaRepository.findById(id).get();
        disableCita.setEstado(0);
        CitaRepository.save(disableCita);
        return "Se desabilito la Cita";
    }

    @PatchMapping(value = "/cita/view/{id}")
    public String viewCita (@PathVariable int id){
        cita viewCita = CitaRepository.findById(id).get();
        viewCita.setEstado(1);
        CitaRepository.save(viewCita);
        return "Se desabilito la Cita";
    }

    @DeleteMapping(value = "/cita/delete/{id}")
    private String deleteCita(@PathVariable int id){
        cita deleteCita =CitaRepository.findById(id).get();
        CitaRepository.delete(deleteCita);
        return "Se elimino el Paciente";
    }


}
