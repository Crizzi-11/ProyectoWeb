
package com.Proyecto.proyecto.controller;


import com.Proyecto.proyecto.entity.Pais;
import com.Proyecto.proyecto.entity.DatosTarjeta;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Proyecto.proyecto.service.IDatosTarjetaService;
import com.Proyecto.proyecto.service.IPaisService;
import java.util.List;

/**
 *
 * @author Cristofer
 */

@Controller
public class DatosTarjetaController {
    
    @Autowired
    private IDatosTarjetaService datosTarjetaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/datosTarjeta")
    public String index(Model model){
        List<DatosTarjeta> listaPersona = datosTarjetaService.getAllDatosTarjeta();
        model.addAttribute("titulo", "Tabla datosTarjeta");
        model.addAttribute("datosTarjetas", listaPersona);
        return "datosTarjetas";
    }
    
    @GetMapping("/datosTarjetaN")
    public String crearPersona(Model model){
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("datosTarjetas", new DatosTarjeta());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    
    
     @GetMapping("/delete/{id}")
    public String eliminarDatosTarjeta(@PathVariable("id") Long idDatosTarjeta){
        datosTarjetaService.delete(idDatosTarjeta);
        return  "redirect:/datosTarjeta";
    }
    
    
    @PostMapping("/save")
    public String guardarDatosTarjeta(@ModelAttribute DatosTarjeta datosTarjeta){
    datosTarjetaService.saveDatosTarjeta(datosTarjeta);
    return "redirect:/datosTarjeta";
    }
    
    @GetMapping("/editDatosTarjeta/{id}")
    public String editarDatosTarjeta(@PathVariable("id") Long idDatosTarjeta, Model model){
    DatosTarjeta datosTarjeta = datosTarjetaService.getDatosTarjetaById(idDatosTarjeta);
    List<Pais> listaPaises = paisService.listCountry();
    model.addAttribute("datosTarjetas", datosTarjeta);
    model.addAttribute("paises", listaPaises);
    return  "crear";
    }
    
    
    
    
    
    
    
    
    
    
}
