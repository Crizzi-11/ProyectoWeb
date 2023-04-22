
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Trabajador;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface ITrabajadorService {
    public List<Trabajador> getAllTrabajador();
    public Trabajador getTrabajadorById(long id);
    public  void saveTrabajador(Trabajador trabajador);
    public void deleteTrabajador (long id);
    
}
