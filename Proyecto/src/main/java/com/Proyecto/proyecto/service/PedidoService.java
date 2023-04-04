
package com.Proyecto.proyecto.service;



import com.Proyecto.proyecto.entity.Pedido;
import com.Proyecto.proyecto.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Cristofer
 */
@Service
public class PedidoService implements IPedidoService{
    
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> getAllPedido() {
    return (List<Pedido>)pedidoRepository.findAll();    }

    @Override
    public Pedido getPedidoById(long id) {
    return pedidoRepository.findById(id).orElse(null);   
    }

    @Override
    public void savePedido(Pedido pedido) {
    pedidoRepository.save(pedido);
    }

    @Override
    public void deletePedido(long id) {
    pedidoRepository.deleteById(id);
    
    }

   
    
    
}
