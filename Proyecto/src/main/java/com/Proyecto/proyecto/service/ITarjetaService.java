
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Tarjeta;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface ITarjetaService {
    public List<Tarjeta> getAllTarjeta();
    public Tarjeta getTarjetaById(long id);
    public  void saveTarjeta(Tarjeta tarjeta);
    public void deleteTarjeta (long id);
    
}
