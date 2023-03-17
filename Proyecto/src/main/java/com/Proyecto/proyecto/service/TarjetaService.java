/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Tarjeta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Proyecto.proyecto.repository.TarjetaRepository;

/**
 *
 * @author Cristofer
 */
@Service
public class TarjetaService implements ITarjetaService{
    
    @Autowired
    private TarjetaRepository tarjetaRepository;
    
    @Override
    public List<Tarjeta> getAllTarjeta(){
    return (List<Tarjeta>)tarjetaRepository.findAll();
    }
    
    @Override
    public  Tarjeta getTarjetaById(long id){
    return tarjetaRepository.findById(id).orElse(null);
    }
    
    @Override
    public void  saveTarjeta(Tarjeta datosTarjeta){
    tarjetaRepository.save(datosTarjeta);
    }
    
    @Override
    public void deleteTarjeta(long id){
    tarjetaRepository.deleteById(id);
    }
    
}
