package com.saulociddev.springsecproject.controllers;

import com.saulociddev.springsecproject.entities.Usuario;
import com.saulociddev.springsecproject.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/user")
    private List<Usuario> getuser(){
        return usuarioRepository.findAll();
    }

}
