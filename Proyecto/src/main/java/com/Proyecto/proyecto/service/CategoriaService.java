/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.service.ICategoriaService;
import com.Proyecto.proyecto.entity.Categoria;
import com.Proyecto.proyecto.repository.CategoriaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ricar_t6uqtj3
 */
@Service
public class CategoriaService  implements ICategoriaService {
 @Autowired
    private CategoriaRepository categoriaRepository;
        
    
    @Override
    public List<Categoria> listCountry() {
         return  (List<Categoria>)categoriaRepository.findAll(); }
    
}
