
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Correo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Proyecto.proyecto.repository.CorreoRepository;

/**
 *
 * @author Cristofer
 */


@Service
public class CorreoService implements ICorreoService{
    
    @Autowired
    private CorreoRepository correoRepository;
    
    @Override
    public List<Correo> listCountry() {
        return (List<Correo>)correoRepository.findAll();
    }
    
}
