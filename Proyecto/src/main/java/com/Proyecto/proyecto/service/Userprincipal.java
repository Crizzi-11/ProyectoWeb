package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Administrador;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



/**
 *
 * @author Cristofer
 */

public class Userprincipal  implements UserDetails{
    private Administrador administrador;
    
    public Userprincipal(Administrador administrador){
        this.administrador = administrador;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
    
        this.administrador.getPermissionList().forEach(p ->{
        GrantedAuthority authority = new SimpleGrantedAuthority(p);
        authorities.add(authority);

        });
            this.administrador.getRoleList().forEach(r ->{
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+ r);
            authorities.add(authority);

        });
        return authorities;
    
    }

    @Override
    public String getPassword() {
        return this.administrador.getPassword();
    }
    
    @Override
    public String getUsername() {
        return this.administrador.getNombre();
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return this.administrador.getActive() == 1;
    }
    
}
