/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.controller;

import com.Proyecto.proyecto.entity.Inscribir;
import com.Proyecto.proyecto.entity.Provincia;
import com.Proyecto.proyecto.service.IInscribirService;
import com.Proyecto.proyecto.service.IProvinciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Cristofer
 */
@Controller
public class InscribirController {
    @Autowired
    private IInscribirService inscribirService;

    @Autowired
    private IProvinciaService provinciaService;

    @GetMapping("/inscribir")
    public String index(Model model) {
        List<Inscribir> listaInscribir = inscribirService.getAllInscribir();
        model.addAttribute("titulo", "Tabla Inscribir");
        model.addAttribute("inscribirse", listaInscribir);
        return "inscribirse";
    }

    @GetMapping("/inscribirN")
    public String crearInscribir(Model model) {
        List<Provincia> listaProvincias = provinciaService.listCountry();
        model.addAttribute("inscribirse", new Inscribir());
        model.addAttribute("provincia", listaProvincias);
        return "crear6";
    }

    @GetMapping("/deleteInscribir/{id}")
    public String eliminarInscribir(@PathVariable("id") Long idInscribir) {
        inscribirService.deleteInscribir(idInscribir);
        return "redirect:/inscribir";
    }

    @PostMapping("/saveInscribir")
    public String guardarInscribir(@ModelAttribute Inscribir inscribir) {
        inscribirService.saveInscribir(inscribir);
        return "redirect:/inscribir";
    }

    @GetMapping("/editInscribir/{id}")
    public String editarAdministrador(@PathVariable("id") Long idInscribir, Model model) {
        Inscribir inscribir = inscribirService.getInscribirById(idInscribir);
        List<Provincia> listaProvincias = provinciaService.listCountry();
        model.addAttribute("inscribirse", inscribir);
        model.addAttribute("provincia", listaProvincias);
        return "crear6";
    }
    
    
}
