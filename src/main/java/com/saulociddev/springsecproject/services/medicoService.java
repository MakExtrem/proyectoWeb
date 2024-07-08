package com.saulociddev.springsecproject.services;

import com.saulociddev.springsecproject.repositories.medicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
