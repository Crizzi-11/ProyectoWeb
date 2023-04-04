
package com.Proyecto.proyecto.controller;

import com.Proyecto.proyecto.entity.Administrador;
import com.Proyecto.proyecto.entity.Provincia;
import com.Proyecto.proyecto.service.IAdministradorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Proyecto.proyecto.service.IProvinciaService;

/**
 *
 * @author Cristofer
 */
@Controller
public class AdministradorController {
    @Autowired
    private IAdministradorService administradorService;

    @Autowired
    private IProvinciaService provinciaService;

    @GetMapping("/administrador")
    public String index(Model model) {
        List<Administrador> listaAdministrador = administradorService.getAllAdministrador();
        model.addAttribute("titulo", "Tabla Administrador");
        model.addAttribute("admins", listaAdministrador);
        return "admins";
    }

    @GetMapping("/administradorN")
    public String crearAdministrador(Model model) {
        List<Provincia> listaProvincias = provinciaService.listCountry();
        model.addAttribute("admins", new Administrador());
        model.addAttribute("provincia", listaProvincias);
        return "crear5";
    }

    @GetMapping("/deleteAdministrador/{id}")
    public String eliminarAdministrador(@PathVariable("id") Long idAdministrador) {
        administradorService.deleteAdministrador(idAdministrador);
        return "redirect:/administrador";
    }

    @PostMapping("/saveAdministrador")
    public String guardarDato(@ModelAttribute Administrador administrador) {
        administradorService.saveAdministrador(administrador);
        return "redirect:/administrador";
    }

    @GetMapping("/editAdministrador/{id}")
    public String editarAdministrador(@PathVariable("id") Long idAdministrador, Model model) {
        Administrador administrador = administradorService.getAdministradorById(idAdministrador);
        List<Provincia> listaProvincias = provinciaService.listCountry();
        model.addAttribute("admins", administrador);
        model.addAttribute("provincia", listaProvincias);
        return "crear5";
    }
    
}
