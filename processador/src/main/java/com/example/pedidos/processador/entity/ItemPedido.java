package com.example.pedidos.processador.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemPedido {

    @Id
    private UUID id = UUID.randomUUID();

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Pedido pedido;

    private Integer quantidade;
}
