package com.saulociddev.springsecproject.controllers;

import java.security.Principal;
import java.util.List;
import com.saulociddev.springsecproject.entities.cita;
import com.saulociddev.springsecproject.repositories.citaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.saulociddev.springsecproject.entities.Usuario;
import com.saulociddev.springsecproject.exceptions.MyException;
import com.saulociddev.springsecproject.services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private UsuarioService userServ;


    @GetMapping("/")
    public String home(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "home";
    }

    @GetMapping("/index")
    public String index(){

        return "/index";
    }

    @GetMapping("/citas")
    public String citas(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "citas";
    }

    @GetMapping("/plansalud")
    public String planSalud(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "planSalud";
    }
    @GetMapping("/ubicanos")
    public String ubicanos(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "ubicanos";
    }

    @GetMapping("/pacientes")
    public String pacientes(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "pacientes";
    }
    @GetMapping("/medicos")
    public String medicos(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "medicos";
    }

    @GetMapping("/citasmodificar")
    public String citasmodificar(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "citasmodificar";
    }
    @GetMapping("/pacientesmodificar")
    public String pacientesmodificar(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "pacientesmodificar";
    }
    @GetMapping("/especialidadesAdd")
    public String especialidadesAdd(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "especialidadesAdd";
    }

    @GetMapping("/medicoAdd")
    public String medicoAdd(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "medicoAdd";
    }

    @GetMapping("/medicoModificar")
    public String medicoModificar(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "medicoModificar";
    }

    @GetMapping("/especialistas")
    public String especialistas(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "especialistas";
    }
    @GetMapping("/especialidades")
    public String especialidades(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "especialidades";
    }
    @GetMapping("/cardiologia")
    public String cardiologia(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "EspecUser/cardiologia";
    }
    @GetMapping("/medicinaGeneral")
    public String medicinaGeneral(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "EspecUser/medicinaGeneral";
    }
    @GetMapping("/ginecologia")
    public String ginecologia(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "EspecUser/ginecologia";
    }
    @GetMapping("/odontologia")
    public String odontologia(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "EspecUser/odontologia";
    }
    @GetMapping("/nutricionista")
    public String nutricionista(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "EspecUser/nutricionista";
    }
    @GetMapping("/psicologia")
    public String psicologia(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "EspecUser/psicologia";
    }

    @GetMapping("/agenda")
    public String agenda(Model model, Principal principal){
        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }
        return "agendaCita";
    }


    @GetMapping("/registraruser")
    public String registrar(){
        return "registraruser";
    }


    @PostMapping("/registrar")
    public String registrar(
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String password2,
            @RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam int dni,
            @RequestParam String fechaNacimiento,
            @RequestParam String genero,
            @RequestParam int telefono,
            ModelMap modelo) throws MyException {
        try {
            userServ.nuevoUsuario(username, email, password, password2,nombre,apellido,dni,fechaNacimiento,genero,telefono);
            modelo.addAttribute("exito", "Te has registrado con éxito! Ahora inicia sesión.");
            return "index";
        } catch (MyException e) {
            modelo.addAttribute("error", e.getMessage());
            return "registraruser";
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody String email, @RequestParam String password, ModelMap modelo) throws MyException {
        try {
            userServ.validarLogin(email, password);
            userServ.loadUserByUsername(email);
            return "inicio";
        } catch (Exception e) {
            // Toma la excepción de UserDetail del logeo "UsernameNotFoundException("Error al encontrar usuario")"
            return "index";
        }
    }

    
    @PreAuthorize("hasAnyRole('USER','ADMIN','MODERATOR')")
    @GetMapping("/inicio")
    public String inicio(HttpSession sesion, ModelMap modelo,Model model, Principal principal){

        if (principal != null) {
            model.addAttribute("isLoggedIn", true);
        } else if  (principal == null) {
            model.addAttribute("isLoggedIn", false);
        }

        Usuario logeado = (Usuario) sesion.getAttribute("logeado");
        modelo.addAttribute("logeado", logeado);
        listarItems(modelo);
        if (logeado.getRol().toString().equals("ADMIN") || logeado.getRol().toString().equals("MODERATOR")) {
            return "inicioAdmin";
        }
        return "inicio";
    }

    @PreAuthorize("hasAnyRole('ADMIN','MODERATOR')")
    @PostMapping("/admin/borrar/{id}")
    public String borrar(@PathVariable String id, ModelMap modelo){
        try {
            userServ.borrarUsuario(id);
            listarItems(modelo);
            return "admin";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            listarItems(modelo);
            return "admin";
        }
    }

    @PreAuthorize("hasAnyRole('ADMIN','MODERATOR')")
    @GetMapping("/inicioAdmin")
    public String admin(){
        return "inicioAdmin";
    }

    public void listarItems(ModelMap modelo){
        List<Usuario> usuarios = userServ.buscarUsuarios();
        modelo.addAttribute("usuarios", usuarios);
    }

}
