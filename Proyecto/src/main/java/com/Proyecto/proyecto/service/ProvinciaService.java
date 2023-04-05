/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Provincia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Proyecto.proyecto.repository.ProvinciaRepository;

/**
 *
 * @author Cristofer
 */
@Service
public class ProvinciaService implements  IProvinciaService{
    
    @Autowired
    private ProvinciaRepository provinciaRepository;
    
    @Override
    public List<Provincia> listCountry() {
        return (List<Provincia>)provinciaRepository.findAll();
        
    }
    
    
}
