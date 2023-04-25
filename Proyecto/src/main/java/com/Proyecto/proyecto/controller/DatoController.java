package com.Proyecto.proyecto.controller;

import com.Proyecto.proyecto.entity.Dato;
import com.Proyecto.proyecto.entity.Correo;
import com.Proyecto.proyecto.service.IDatoService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Proyecto.proyecto.service.ICorreoService;

/**
 *
 * @author Cristofer
 */
/**
 *
 * @author Cristofer
 */
@Controller
public class DatoController {

    @Autowired
    private IDatoService datoService;

    @Autowired
    private ICorreoService correoService;

    @GetMapping("/dato")
    public String index(Model model) {
        List<Dato> listaDato = datoService.getAllDato();
        model.addAttribute("titulo", "Tabla Dato");
        model.addAttribute("datos", listaDato);
        return "datos";
    }

    @GetMapping("/datoN")
    public String crearDato(Model model) {
        List<Correo> listaCorreos = correoService.listCountry();
        model.addAttribute("datos", new Dato());
        model.addAttribute("correos", listaCorreos);
        return "crearDato";
    }

    @GetMapping("/deleteDato/{id}")
    public String eliminarDato(@PathVariable("id") Long idDato) {
        datoService.deleteDato(idDato);
        return "redirect:/dato";
    }

    @PostMapping("/saveDato")
    public String guardarDato(@ModelAttribute Dato dato) {
        datoService.saveDato(dato);
        return "redirect:/dato";
    }

    @GetMapping("/editDato/{id}")
    public String editarDato(@PathVariable("id") Long idDato, Model model) {
        Dato dato = datoService.getDatoById(idDato);
        List<Correo> listaCorreos = correoService.listCountry();
        model.addAttribute("datos", dato);
        model.addAttribute("correos", listaCorreos);
        return "crearDato";
    }

}
