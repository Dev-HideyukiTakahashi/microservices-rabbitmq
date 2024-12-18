package com.example.pedidos.processador.service;

import com.example.pedidos.processador.entity.ItemPedido;
import com.example.pedidos.processador.entity.Pedido;
import com.example.pedidos.processador.repository.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {

    private final ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public List<ItemPedido> save(List<ItemPedido> itens) {
       return itemPedidoRepository.saveAll(itens);
    }

    public void save(ItemPedido  itemPedido){
        itemPedidoRepository.save(itemPedido);
    }

    public void updatedItemPedido(List<ItemPedido> itemPedidos, Pedido pedido) {
        itemPedidos.forEach(itemPedido -> {
            itemPedido.setPedido(pedido);
            save(itemPedido);
        });
    }
}
