package com.upsilon_tech.java.sample.springrabbitmq.service;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by kenny on 14/04/2017.
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    private static final String EXCHANGE_NAME = "messages";

    @Override
    @RabbitListener(bindings = @QueueBinding( value = @Queue(),
            exchange = @Exchange(value = EXCHANGE_NAME, type = ExchangeTypes.FANOUT)))
    public void consumerMessage(byte[] data) {
        String consumedMessage = new String(data);
        System.out.println(" [x] Consumed  '" + consumedMessage + "'");
    }
}
