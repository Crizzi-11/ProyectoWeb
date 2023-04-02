/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.DatosTarjeta;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface IDatosTarjetaService {
    public List<DatosTarjeta> getAllDatosTarjeta();
    public DatosTarjeta getDatosTarjetaById(long id);
    public  void saveDatosTarjeta(DatosTarjeta datosTarjeta);
    public void delete (long id);
    
}
