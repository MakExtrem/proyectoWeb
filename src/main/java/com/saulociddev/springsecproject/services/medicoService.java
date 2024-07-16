package com.saulociddev.springsecproject.services;

import com.saulociddev.springsecproject.entities.medico;
import com.saulociddev.springsecproject.repositories.medicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class medicoService {

    @Autowired
    private medicoRepository MedicoRepository;

    public String getNombreById(int id_medico) {
        return MedicoRepository.findNombreById(id_medico);
    }
    public String getApellidoById(int id_medico) {
        return MedicoRepository.findApellidoById(id_medico);
    }
    public String obtenerEspecialidad(int id_medico) {
        return MedicoRepository.obtenerEspeci(id_medico);
    }

    public List<medico> getMedicoEspecialidad(int idEsp){
        return MedicoRepository.getMedEsp(idEsp);
    }

    public String GetEspcialidad(int idMedico){
        return MedicoRepository.getEsp(idMedico);
    }

}
