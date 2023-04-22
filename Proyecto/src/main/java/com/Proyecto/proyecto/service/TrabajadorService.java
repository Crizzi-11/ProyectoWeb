
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Trabajador;
import com.Proyecto.proyecto.repository.TrabajadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristofer
 */
@Service
public class TrabajadorService implements ITrabajadorService{
     @Autowired
    private TrabajadorRepository trabajadorRepository;
    
    @Override
    public List<Trabajador> getAllTrabajador(){
    return (List<Trabajador>)trabajadorRepository.findAll();
    }
    
    @Override
    public  Trabajador getTrabajadorById(long id){
    return trabajadorRepository.findById(id).orElse(null);
    }
    
    @Override
    public void  saveTrabajador(Trabajador trabajador){
    trabajadorRepository.save(trabajador);
    }
    
    @Override
    public void deleteTrabajador(long id){
    trabajadorRepository.deleteById(id);
    }
}
