package com.example.pedidos.notificacao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.pedidos.notificacao.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private UUID id = UUID.randomUUID();
    private String cliente;
    private Double valorTotal;
    private String emailNotificacao;
    private Status status = Status.EM_PROCESSAMENTO;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHora = LocalDateTime.now();
    private List<ItemPedido> itens = new ArrayList<>();
}
