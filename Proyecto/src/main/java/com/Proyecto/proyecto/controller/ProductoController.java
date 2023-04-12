/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.controller;

import com.Proyecto.proyecto.entity.Categoria;
import com.Proyecto.proyecto.entity.Producto;

import com.Proyecto.proyecto.service.ICategoriaService;
import com.Proyecto.proyecto.service.IProductoService;
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
 * @author ricar_t6uqtj3
 */
@Controller
public class ProductoController {
    
    @Autowired
    private IProductoService productoService;
    
    @Autowired
    private ICategoriaService categoriaService;
    
    @GetMapping("/producto")
    public String index(Model model){
        List<Producto> listaProductos = productoService.getAllProducto();
        model.addAttribute("titulo","Tabla Producto");
        model.addAttribute("productos",listaProductos);
        return "productos";
    }
    
    @GetMapping("/productoN")
    public String crearProducto(Model model){
        List<Categoria> listaCategorias = categoriaService.listCountry();
          model.addAttribute("productos", new Producto());
          model.addAttribute("categorias", listaCategorias);
          return "crearC";
    }
    
    @GetMapping("/deleteArticulo/{id}")
    public String eliminarArticulo(@PathVariable("id") Long idProducto){
        return "redirect:/producto";
    }
    
     
    @PostMapping("/saveArticulo")
    public String guardarProducto(@ModelAttribute Producto producto){
    productoService.saveArticulo(producto);
    return "redirect:/producto";
        
    }
    @GetMapping("/editArticulo/{id}")
    public String editarProducto(@PathVariable("id") Long idProducto, Model model){
       Producto producto = productoService.getProductoById(idProducto);
       List<Categoria> listaCategoria = categoriaService.listCountry();
       model.addAttribute("productos",producto);
       model.addAttribute("categorias", listaCategoria);
       return "crearC";
    }
}
