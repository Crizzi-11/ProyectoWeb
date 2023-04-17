
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
@Table(name = "inscribirse")
public class Inscribir implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String noticia;
    private String descuentos;
    private String ofertas;
    private String usuario;
    private String email;
    
    
    @ManyToOne
    @JoinColumn(name = "provincias_id")
    
    private Provincia provincia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public String getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }

    public String getOfertas() {
        return ofertas;
    }

    public void setOfertas(String ofertas) {
        this.ofertas = ofertas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
    
}
