
package com.Proyecto.proyecto.controller;

import com.Proyecto.proyecto.entity.Trabajador;
import com.Proyecto.proyecto.entity.Provincia;
import com.Proyecto.proyecto.service.ITrabajadorService;
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
public class TrabajadorController {
    @Autowired
    private ITrabajadorService trabajadorService;

    @Autowired
    private IProvinciaService provinciaService;

    @GetMapping("/trabajador")
    public String index(Model model) {
        List<Trabajador> listaAdministrador = trabajadorService.getAllTrabajador();
        model.addAttribute("titulo", "Tabla Admins");
        model.addAttribute("trabajadores", listaAdministrador);
        return "trabajadores";
    }

    @GetMapping("/trabajadorN")
    public String crearTrabajador(Model model) {
        List<Provincia> listaProvincias = provinciaService.listCountry();
        model.addAttribute("trabajadores", new Trabajador());
        model.addAttribute("provincia", listaProvincias);
        return "crearTrabajor";
    }

    @GetMapping("/deleteTrabajador/{id}")
    public String eliminarTrabajador(@PathVariable("id") Long idTrabajador) {
        trabajadorService.deleteTrabajador(idTrabajador);
        return "redirect:/trabajador";
    }

    @PostMapping("/saveTrabajador")
    public String guardarDato(@ModelAttribute Trabajador trabajador) {
        trabajadorService.saveTrabajador(trabajador);
        return "redirect:/trabajador";
    }

    @GetMapping("/editTrabajador/{id}")
    public String editarTrabajador(@PathVariable("id") Long idTrabajador, Model model) {
        Trabajador trabajador = trabajadorService.getTrabajadorById(idTrabajador);
        List<Provincia> listaProvincias = provinciaService.listCountry();
        model.addAttribute("trabajadores", trabajador);
        model.addAttribute("provincia", listaProvincias);
        return "crearTrabajor";
    }
    
}
