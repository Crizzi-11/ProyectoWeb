/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto;

import com.Proyecto.proyecto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 *
 * @author Cristofer
 */
@Configuration
@EnableWebSecurity
public class SecurityConfing extends WebSecurityConfigurerAdapter{
    
    @Autowired
    private UserService userDetailsService;
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }
    @Bean
    public UserService getUserService(){
        return  new UserService();
    }
    
     @Bean
    DaoAuthenticationProvider authenticationProvider (){
       DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
       daoAuthenticationProvider.setPasswordEncoder (passwordEncoder ());
       daoAuthenticationProvider.setUserDetailsService (getUserService ());
       return daoAuthenticationProvider;
    }
    
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler () {
        return new AppAuthenticationSuccessHandler(); 
    }
    
    public SecurityConfing (UserService userPrincipalDetailsService) {
        this.userDetailsService = userPrincipalDetailsService;
    }
    
    @Override
    protected void configure (AuthenticationManagerBuilder auth) {
        auth.authenticationProvider (authenticationProvider());
    }
    // El siguiente metodo funciona para hacer la autenticacion del usuario
    @Override
    protected void configure (HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers ("/administrador","/login")
                .hasRole ("ADMIN")
                .antMatchers ("/administradorN", "/administrador","/","/login")
                .hasAnyRole ("USER","VENDEDOR","ADMIN")
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/administrador",true).and().logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/");
        
    }
    
    
    
    
}

