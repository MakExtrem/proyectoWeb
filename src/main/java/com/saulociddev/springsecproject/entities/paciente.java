package com.saulociddev.springsecproject.entities;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
@Table(schema = "Paciente")
public class paciente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String nombre;
    @Column
    public String apellido;
    @Column
    public int dni;
    @Column
    public int telefono;
    @Column
    public String email;
    @Column
    public String fechaNacimiento;
    @Column
    public String fechaRegistro;
    @Column
    public String genero;
    @Column
    public int activo;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Column
    public int iduser;

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String setFechaSistema(){
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
        /*horaAtencion=dateFormat.format(date);*/

    }
}
