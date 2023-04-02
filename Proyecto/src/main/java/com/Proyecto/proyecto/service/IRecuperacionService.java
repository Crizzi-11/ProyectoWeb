/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Recuperacion;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface IRecuperacionService {
    
     public List<Recuperacion> getAllRecuperacion();
    public Recuperacion getRecuperacionById(long id);
    public  void saveRecuperacion(Recuperacion recuperacion);
    public void deleteRecuperacion (long id);
    
}
