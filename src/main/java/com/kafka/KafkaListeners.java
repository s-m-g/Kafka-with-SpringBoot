package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics="topic1",
            groupId="group1"
    )
    void listener(String data){
        System.out.println("Listener got message : "+data);
    }
}
