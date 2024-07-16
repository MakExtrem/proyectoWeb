package com.saulociddev.springsecproject.entities;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(schema = "Especialidad")
public class especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String nombre;
    @Column
    public String fechaRegistro;
    @Column
    public int activo;

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

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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
