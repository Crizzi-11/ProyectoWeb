/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Administrador;
import com.Proyecto.proyecto.repository.AdministradorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristofer
 */
@Service
public class AdministradorService  implements IAdministradorService{
    
    @Autowired
    private AdministradorRepository administradorRepository;
    
    @Override
    public List<Administrador> getAllAdministrador(){
    return (List<Administrador>)administradorRepository.findAll();
    }
    
    @Override
    public  Administrador getAdministradorById(long id){
    return administradorRepository.findById(id).orElse(null);
    }
    
    @Override
    public void  saveAdministrador(Administrador administrador){
    administradorRepository.save(administrador);
    }
    
    @Override
    public void deleteAdministrador(long id){
    administradorRepository.deleteById(id);
    }
    
    
}
