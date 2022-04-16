package com.example.user.rabbitmq;

import com.example.user.configuration.RabbitMqConfiguration;
import com.example.user.dto.UserDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;


/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 * @purpose to get data data from Rabbitmq server
 */
@Configuration
public class SubscribeMessage {
    /**
     *
     * @param userDTO getting from server
     * @return returning the UserDTO
     */
    @RabbitListener(queues = RabbitMqConfiguration.QUEUE)
   public UserDTO getUserDto(UserDTO userDTO){
        System.out.println("the get data from queue is "+userDTO);
        return userDTO;
    }
}
