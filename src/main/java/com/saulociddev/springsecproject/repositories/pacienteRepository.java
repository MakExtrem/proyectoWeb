package com.saulociddev.springsecproject.repositories;

import com.saulociddev.springsecproject.entities.paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pacienteRepository extends JpaRepository<paciente,Integer> {
}
