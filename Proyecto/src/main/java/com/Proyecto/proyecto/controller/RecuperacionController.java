
package com.Proyecto.proyecto.controller;

import com.Proyecto.proyecto.entity.Correo;
import com.Proyecto.proyecto.entity.Recuperacion;
import com.Proyecto.proyecto.service.ICorreoService;
import com.Proyecto.proyecto.service.IRecuperacionService;
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
public class RecuperacionController {
    
    @Autowired
    private IRecuperacionService recuperacionService;

    @Autowired
    private ICorreoService correoService;

    @GetMapping("/recuperacion")
    public String index(Model model) {
        List<Recuperacion> listaRecuperacion = recuperacionService.getAllRecuperacion();
        model.addAttribute("titulo", "Tabla Recuperacion");
        model.addAttribute("recuperaciones", listaRecuperacion);
        return "recuperaciones";
    }

    @GetMapping("/recuperacionN")
    public String crearRecuperacion(Model model) {
        List<Correo> listaCorreos = correoService.listCountry();
        model.addAttribute("recuperaciones", new Recuperacion());
        model.addAttribute("correos", listaCorreos);
        return "crearRecuperacion";
    }

    @GetMapping("/deleteRecuperacion/{id}")
    public String eliminarRecuperacion(@PathVariable("id") Long idRecuperacion) {
        recuperacionService.deleteRecuperacion(idRecuperacion);
        return "redirect:/recuperacion";
    }

    @PostMapping("/saveRecuperacion")
    public String guardarDato(@ModelAttribute Recuperacion recuperacion) {
        recuperacionService.saveRecuperacion(recuperacion);
        return "redirect:/recuperacion";
    }

    @GetMapping("/editRecuperacion/{id}")
    public String editarRecuperacion(@PathVariable("id") Long idRecuperacion, Model model) {
        Recuperacion recuperacion = recuperacionService.getRecuperacionById(idRecuperacion);
        List<Correo> listaCorreos = correoService.listCountry();
        model.addAttribute("recuperaciones", recuperacion);
        model.addAttribute("correos", listaCorreos);
        return "crearRecuperacion";
    }
    
}
