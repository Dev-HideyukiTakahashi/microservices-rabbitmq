package com.example.pedidos.processador.entity;

import com.example.pedidos.processador.entity.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    private UUID id = UUID.randomUUID();
    private String cliente;
    private Double valorTotal;
    private String emailNotificacao;
    private Status status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHora = LocalDateTime.now();
    private List<ItemPedido> itens = new ArrayList<>();
}
