package com.upsilon_tech.java.sample.springrabbitmq.service;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.stereotype.Service;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by kenny on 14/04/2017.
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    private static final String EXCHANGE_NAME = "messages";

    @Override
    public void produceMessage(String message) {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            
            channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

            
            channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
            System.out.println(" [x] Sent '" + message  + "'");
            
            channel.close();
            connection.close();
        } catch (IOException io) {
            System.out.println("IOException");
            io.printStackTrace();
        } catch (TimeoutException toe) {
            System.out.println("TimeoutException : " + toe.getMessage());
            toe.printStackTrace();
        }
    }
}
