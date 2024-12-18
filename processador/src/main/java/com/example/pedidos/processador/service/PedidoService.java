package com.example.pedidos.processador.service;

import com.example.pedidos.processador.entity.ItemPedido;
import com.example.pedidos.processador.entity.Pedido;
import com.example.pedidos.processador.repository.PedidoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final Logger logger = LoggerFactory.getLogger(PedidoService.class);
    private final PedidoRepository pedidoRepository;
    private final ProdutoService produtoService;
    private final ItemPedidoService itemPedidoService;

    public PedidoService(PedidoRepository pedidoRepository, ProdutoService produtoService, ItemPedidoService itemPedidoService) {
        this.pedidoRepository = pedidoRepository;
        this.produtoService = produtoService;
        this.itemPedidoService = itemPedidoService;
    }

    public void salvar(Pedido pedido){
        produtoService.save(pedido.getItens());
        List<ItemPedido> itemPedidos = itemPedidoService.save(pedido.getItens());
        pedidoRepository.save(pedido);
        itemPedidoService.updatedItemPedido(itemPedidos, pedido);

        logger.info("Pedido salvo: {}", pedido.toString());
    }
}
