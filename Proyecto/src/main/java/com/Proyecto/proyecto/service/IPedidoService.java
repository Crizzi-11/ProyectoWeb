/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.proyecto.service;

import com.Proyecto.proyecto.entity.Pedido;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface IPedidoService {
    
    public List<Pedido> getAllPedido();
    public Pedido getPedidoById(long id);
    public  void savePedido(Pedido pedido);
    public void deletePedido (long id);
    
    
}
