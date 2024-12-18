package com.example.pedidos.processador.service;

import com.example.pedidos.processador.entity.ItemPedido;
import com.example.pedidos.processador.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void save(List<ItemPedido> itens) {
        itens.forEach(item ->{
            produtoRepository.save(item.getProduto());
        });
    }
}
