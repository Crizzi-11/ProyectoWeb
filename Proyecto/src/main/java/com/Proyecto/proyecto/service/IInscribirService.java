/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Inscribir;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface IInscribirService {
    public List<Inscribir> getAllInscribir();
    public Inscribir getInscribirById(long id);
    public  void saveInscribir(Inscribir inscribir);
    public void deleteInscribir (long id);
    
}
