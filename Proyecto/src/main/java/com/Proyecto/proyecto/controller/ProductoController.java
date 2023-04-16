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
    public String index(Model model) {
        List<Producto> listaProducto= productoService.getAllProducto();
        model.addAttribute("titulo", "Tabla Dato");
        model.addAttribute("productos", listaProducto);
        return "productos";
    }

    @GetMapping("/productoN")
    public String crearProducto(Model model) {
        List<Categoria> listaCategoria = categoriaService.listCountry();
        model.addAttribute("productos", new Producto());
        model.addAttribute("categorias", listaCategoria);
        return "crearC";
    }

    @GetMapping("/deletProducto/{id}")
    public String eliminarProducto(@PathVariable("id") Long idProducto) {
        productoService.deleteProducto(idProducto);
        return "redirect:/producto";
    }

    @PostMapping("/saveProducto")
    public String guardarDato(@ModelAttribute Producto producto) {
        productoService.saveProducto(producto);
        return "redirect:/producto";
    }

    @GetMapping("/editProducto/{id}")
    public String editarProducto(@PathVariable("id") Long idProducto, Model model) {
        Producto producto = productoService.getProductoById(idProducto);
        List<Categoria> listaCategorias = categoriaService.listCountry();
        model.addAttribute("productos", producto);
        model.addAttribute("categorias", listaCategorias);
        return "crearc";
    }

}
   

