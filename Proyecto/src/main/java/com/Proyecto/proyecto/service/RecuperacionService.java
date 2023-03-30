/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;


import com.Proyecto.proyecto.entity.Recuperacion;

import com.Proyecto.proyecto.repository.RecuperacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristofer
 */
@Service
public class RecuperacionService implements IRecuperacionService{

    @Autowired
    private RecuperacionRepository recuperacionRepository;
    
    @Override
    public List<Recuperacion> getAllRecuperacion(){
    return (List<Recuperacion>)recuperacionRepository.findAll();
    }
    
    @Override
    public  Recuperacion getRecuperacionById(long id){
    return recuperacionRepository.findById(id).orElse(null);
    }
    
    @Override
    public void  saveRecuperacion(Recuperacion recuperacion){
    recuperacionRepository.save(recuperacion);
    }
    
    @Override
    public void deleteRecuperacion(long id){
    recuperacionRepository.deleteById(id);
    }
}
