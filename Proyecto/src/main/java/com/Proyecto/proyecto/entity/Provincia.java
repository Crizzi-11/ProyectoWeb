
package com.Proyecto.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 *
 * @author Cristofer
 */
@Entity
@Table(name = "provincias")
public class Provincia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String provincia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincias(String provincias) {
        this.provincia = provincia;
    }

    

    
  
   

}