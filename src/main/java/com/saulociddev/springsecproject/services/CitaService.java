package com.saulociddev.springsecproject.services;

import com.saulociddev.springsecproject.repositories.citaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private citaRepository CitaRepository;


    public List<Object[]> getRecommendedDoctors(String idPaciente, String idEspecialidad) {
        return CitaRepository.recomdoctor(idPaciente,idEspecialidad);
    }
    public List<Object[]> getlistmed( int idEspecialidad) {
        return CitaRepository.obtenerlista(idEspecialidad);
    }

}
