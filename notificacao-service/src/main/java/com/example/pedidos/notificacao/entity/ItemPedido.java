package com.example.pedidos.notificacao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {
    private UUID id = UUID.randomUUID();
    private Produto produto;
    private Integer quantidade;
}
