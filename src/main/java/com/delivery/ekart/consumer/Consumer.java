package com.delivery.ekart.consumer;

import com.delivery.ekart.model.Delivery;
import com.delivery.ekart.repository.DeliveryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
   @Autowired
   DeliveryRepo deliveryRepo;
    @KafkaListener(topics = "notification", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
        Delivery delivery = new Delivery();
        delivery.setMessage(message);
        deliveryRepo.save(delivery);
    }
}

