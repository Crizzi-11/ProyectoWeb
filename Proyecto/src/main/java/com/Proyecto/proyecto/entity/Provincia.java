
package com.Proyecto.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

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