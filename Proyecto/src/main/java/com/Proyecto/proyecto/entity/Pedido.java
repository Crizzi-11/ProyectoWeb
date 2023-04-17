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
@Table(name = "pedidos")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String articulo;
    private String talla;
    private String color;
    private String empresa;
    private String envio;
    
    
    @ManyToOne
    @JoinColumn(name = "paises_id")
    
    private Pais pais;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getArticulo() {
            return articulo;
        }

        public void setArticulo(String articulo) {
            this.articulo = articulo;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        public String getEnvio() {
            return envio;
        }

        public void setEnvio(String envio) {
            this.envio = envio;
        }

        public Pais getPais() {
            return pais;
        }

        public void setPais(Pais pais) {
            this.pais = pais;
        }
    
    
    
    
    
    
}
