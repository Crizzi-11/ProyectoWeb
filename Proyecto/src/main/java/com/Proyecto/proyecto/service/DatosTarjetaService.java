/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.DatosTarjeta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Proyecto.proyecto.repository.DatosTarjetaRepository;

/**
 *
 * @author Cristofer
 */
@Service
public class DatosTarjetaService implements IDatosTarjetaService{
    
    @Autowired
    private DatosTarjetaRepository datosTarjetaRepository;
    
    @Override
    public List<DatosTarjeta> getAllDatosTarjeta(){
    return (List<DatosTarjeta>)datosTarjetaRepository.findAll();
    }
    
    @Override
    public  DatosTarjeta getDatosTarjetaById(long id){
    return datosTarjetaRepository.findById(id).orElse(null);
    }
    
    @Override
    public void  saveDatosTarjeta(DatosTarjeta datosTarjeta){
    datosTarjetaRepository.save(datosTarjeta);
    }
    
    @Override
    public void delete(long id){
    datosTarjetaRepository.deleteById(id);
    }
    
}
