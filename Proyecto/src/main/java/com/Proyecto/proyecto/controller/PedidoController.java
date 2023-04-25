
package com.Proyecto.proyecto.controller;

import com.Proyecto.proyecto.entity.Pais;
import com.Proyecto.proyecto.entity.Pedido;
import com.Proyecto.proyecto.service.IPaisService;
import com.Proyecto.proyecto.service.IPedidoService;
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
public class PedidoController {
    @Autowired
    private IPedidoService pedidoService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/pedido")
    public String index(Model model){
        List<Pedido> listaPedido = pedidoService.getAllPedido();
        model.addAttribute("titulo", "Tabla Pedido");
        model.addAttribute("pedidos", listaPedido);
        return "pedidos";
    }
    
    @GetMapping("/pedidoN")
    public String crearPedido(Model model){
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("pedidos", new Pedido());
        model.addAttribute("paises", listaPaises);
        return "crearPedido";
    }
    
    
     @GetMapping("/deletePedido/{id}")
    public String eliminarPedido(@PathVariable("id") Long idPedido){
        pedidoService.deletePedido(idPedido);
        return  "redirect:/pedido";
    }
    
    
    @PostMapping("/savePedido")
    public String guardarPedido(@ModelAttribute Pedido pedido){
    pedidoService.savePedido(pedido);
    return "redirect:/pedido";
    }
    
    @GetMapping("/editPedido/{id}")
    public String editarPedido(@PathVariable("id") Long idPedido, Model model){
    Pedido pedido = pedidoService.getPedidoById(idPedido);
    List<Pais> listaPaises = paisService.listCountry();
    model.addAttribute("pedidos", pedido);
    model.addAttribute("paises", listaPaises);
    return  "crearPedido";
    }
    
    
    
    
}
