/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.repository;

import com.Proyecto.proyecto.entity.Provincia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristofer
 */

@Repository
public interface ProvinciaRepository extends CrudRepository<Provincia, Long>{
    
}
