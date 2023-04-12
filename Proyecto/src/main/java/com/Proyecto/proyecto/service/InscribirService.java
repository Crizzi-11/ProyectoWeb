/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Inscribir;
import com.Proyecto.proyecto.repository.InscribirRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristofer
 */
@Service
public class InscribirService implements IInscribirService{
    
    @Autowired
    private InscribirRepository inscribirRepository;
    
    @Override
    public List<Inscribir> getAllInscribir(){
    return (List<Inscribir>)inscribirRepository.findAll();
    }
    
    @Override
    public  Inscribir getInscribirById(long id){
    return inscribirRepository.findById(id).orElse(null);
    }
    
    @Override
    public void  saveInscribir(Inscribir inscribir){
    inscribirRepository.save(inscribir);
    }
    
    @Override
    public void deleteInscribir(long id){
    inscribirRepository.deleteById(id);
    }
    
}
