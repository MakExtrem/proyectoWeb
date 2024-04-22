package com.saulociddev.springsecproject.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(schema = "Cita")
public class cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int id_Medico;
    @Column
    private int id_Paciente;
    @Column
    private int id_user;
    @Column
    private String fechaAtencion;
    @Column
    private String horaAtencion;
    @Column
    private String fechaRegistro;
    @Column
    private String observaciones;
    @Column
    private int estado;



    //Cambiar a de horas a dias y llamar a la funcion correspondinte
    public String setHoraAtencionini(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
       return dateFormat.format(date);
        /*horaAtencion=dateFormat.format(date);*/

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Medico() {
        return id_Medico;
    }

    public void setId_Medico(int id_Medico) {
        this.id_Medico = id_Medico;
    }

    public int getId_Paciente() {
        return id_Paciente;
    }

    public void setId_Paciente(int id_Paciente) {
        this.id_Paciente = id_Paciente;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
