/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Producto;
import java.util.List;

/**
 *
 * @author ricar_t6uqtj3
 */
public interface IProductoService {
     public List<Producto> getAllProducto();
     public Producto getProductoById(long id);
     public void saveArticulo(Producto producto);
     public void deleteArticulo(long id);
}