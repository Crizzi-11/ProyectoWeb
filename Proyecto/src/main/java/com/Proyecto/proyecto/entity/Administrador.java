/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
@Table(name = "admins")

public class Administrador  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String segundo;
    private String apellido1;
    private String apellido2;
    private String labor;
    
    private String password;
    private int active;
    private String roles = "";
    private String permissions = "";

   
    
    @ManyToOne
    @JoinColumn(name = "provincias_id")
    
    private Provincia provincia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    

   
    public List<String> getRoleList(){
    if (this.roles.length() > 0){
        return Arrays.asList(this.roles.split(","));
        
    }
        return new ArrayList<>();
        
        
        }
    public List<String> getPermissionList(){
    if (this.permissions.length() > 0){
        return Arrays.asList(this.roles.split(","));
        
    }
        return new ArrayList<>();
        
        
        }
    
    
    
    
}
