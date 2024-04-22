package com.saulociddev.springsecproject.repositories;

import com.saulociddev.springsecproject.entities.medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface medicoRepository extends JpaRepository<medico,Integer> {

}
