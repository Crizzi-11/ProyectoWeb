/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.repository;

import com.Proyecto.proyecto.entity.Categoria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ricar_t6uqtj3
 */
@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
    
}
