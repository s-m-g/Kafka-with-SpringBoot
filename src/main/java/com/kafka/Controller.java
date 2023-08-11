package com.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class Controller {

    KafkaTemplate<String, String> kt;

    public Controller(KafkaTemplate<String, String> kafkaTemplate){
        this.kt = kafkaTemplate;
    }

    @PostMapping("/{message}")
    public void postMessage(@PathVariable String message){
        kt.send("topic1", message);
    }
}
