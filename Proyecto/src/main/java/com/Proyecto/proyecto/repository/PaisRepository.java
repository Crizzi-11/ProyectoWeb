/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.repository;
import com.Proyecto.proyecto.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristofer
 * paisRepository
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long >{
    
    
}
