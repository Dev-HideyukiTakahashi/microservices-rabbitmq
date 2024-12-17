package com.example.pedidos.notificacao.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.pedidos.notificacao.entity.Pedido;

@Component
public class PedidoListener {

    private final Logger logger = LoggerFactory.getLogger(PedidoListener.class);

    @RabbitListener(queues = "pedidos.v1.pedido-criado.gerar-notificao")
    public void enviarNotificacao(Pedido pedido) {
        logger.info("Notificação gerada: {}", pedido.toString());
    }
}
