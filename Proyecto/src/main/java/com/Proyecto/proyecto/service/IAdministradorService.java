
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Administrador;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface IAdministradorService {
    public List<Administrador> getAllAdministrador();
    public Administrador getAdministradorById(long id);
    public  void saveAdministrador(Administrador administrador);
    public void deleteAdministrador (long id);
    
}
