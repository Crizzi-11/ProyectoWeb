/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Cristofer
 */
@Entity
@Table(name = "recuperaciones")

public class Recuperacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String verificacion;
    private String contra;
    private String nueva;
    private String confirmacion;
    private String email;
    
    
    @ManyToOne
    @JoinColumn(name = "correos_id")
    
    private Correo correos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(String verificacion) {
        this.verificacion = verificacion;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNueva() {
        return nueva;
    }

    public void setNueva(String nueva) {
        this.nueva = nueva;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Correo getCorreos() {
        return correos;
    }

    public void setCorreos(Correo correos) {
        this.correos = correos;
    }

    
    
    
}
