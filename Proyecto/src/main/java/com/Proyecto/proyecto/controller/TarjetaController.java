
package com.Proyecto.proyecto.controller;


import com.Proyecto.proyecto.entity.Pais;
import com.Proyecto.proyecto.entity.Tarjeta;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Proyecto.proyecto.service.IPaisService;
import java.util.List;
import com.Proyecto.proyecto.service.ITarjetaService;

/**
 *
 * @author Cristofer
 */

@Controller
public class TarjetaController {
    
    @Autowired
    private ITarjetaService tarjetaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/tarjeta")
    public String index(Model model){
        List<Tarjeta> listaTarjeta = tarjetaService.getAllTarjeta();
        model.addAttribute("titulo", "Tabla Tarjeta");
        model.addAttribute("tarjetas", listaTarjeta);
        return "tarjetas";
    }
    
    @GetMapping("/tarjetaN")
    public String crearTarjeta(Model model){
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("tarjetas", new Tarjeta());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    
    
     @GetMapping("/delete/{id}")
    public String eliminarTarjeta(@PathVariable("id") Long idTarjeta){
        tarjetaService.deleteTarjeta(idTarjeta);
        return  "redirect:/tarjeta";
    }
    
    
    @PostMapping("/save")
    public String guardarTarjeta(@ModelAttribute Tarjeta tarjeta){
    tarjetaService.saveTarjeta(tarjeta);
    return "redirect:/tarjeta";
    }
    
    @GetMapping("/editTarjeta/{id}")
    public String editarTarjeta(@PathVariable("id") Long idTarjeta, Model model){
    Tarjeta tarjeta = tarjetaService.getTarjetaById(idTarjeta);
    List<Pais> listaPaises = paisService.listCountry();
    model.addAttribute("tarjetas", tarjeta);
    model.addAttribute("paises", listaPaises);
    return  "crear";
    }
    
    
    
    
    
    
    
    
    
    
}
