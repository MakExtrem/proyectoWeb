package com.saulociddev.springsecproject.controllers;

import com.saulociddev.springsecproject.entities.Usuario;
import com.saulociddev.springsecproject.entities.cita;
import com.saulociddev.springsecproject.repositories.citaRepository;
import com.saulociddev.springsecproject.services.CitaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class citaController  {
    @Autowired
    private citaRepository CitaRepository;

    @Autowired
    private CitaService citaService;

    @GetMapping(value = "/cita")
    private List<cita> getCita(){

        return CitaRepository.findAll();
    }


    @GetMapping("/cita/recdoc/{idEs}")
    public List<Object[]> getRecommendedDoctors(@PathVariable int idEs,HttpSession sesion,ModelMap modelo) {
        Usuario logeado = (Usuario) sesion.getAttribute("logeado");
        modelo.addAttribute("logeado", logeado);
        int id = Integer.parseInt(logeado.getId());
        String id_paciente = String.valueOf(id);
        String id_especialidad = String.valueOf(idEs);
        return citaService.getRecommendedDoctors(id_paciente,id_especialidad);
    }

    @PostMapping(value = "/cita/save")
    private String saveCita(@RequestBody cita Cita ,HttpSession sesion, ModelMap modelo){
        //Prueba
        //Cita.setHoraAtencion(Cita.setHoraAtencionini());
        Cita.setFechaRegistro(Cita.setFechaSistema());

        Usuario logeado = (Usuario) sesion.getAttribute("logeado");
        modelo.addAttribute("logeado", logeado);
        int id = Integer.parseInt(logeado.getId());
        Cita.setId_Paciente(id);

        Cita.setId_user(id);
        Cita.setEstado(1);

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
