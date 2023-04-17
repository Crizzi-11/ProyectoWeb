package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Administrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 *
 * @author Cristofer
 */
@Service
public class UserService implements  UserDetailsService{

    @Autowired
    public IAdministradorService administradorService;
    
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Administrador administrador = this.administradorService.findByNombre(username);
        Userprincipal userprincipal = new Userprincipal(administrador);
        return userprincipal;
    
    }
    
}
