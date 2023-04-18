/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Administrador;
import com.Proyecto.proyecto.entity.Producto;
import com.Proyecto.proyecto.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ricar_t6uqtj3
 */
@Service
public class ProductoService  implements IProductoService{

     @Autowired
     private ProductoRepository productoRepository;
     
    @Override
    public List<Producto> getAllProducto() {
         return (List<Producto>)productoRepository.findAll();
  }

    @Override
    public Producto getProductoById(long id) {
         return productoRepository.findById(id).orElse(null);
   }

    @Override
    public void saveArticulo(Producto producto) {
      productoRepository.save(producto);
              }

    @Override
    public void deleteProducto(long id) {
        productoRepository.deleteById(id);
    
}}
