package com.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerConsumnerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaProducerConsumnerApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args->{
			kafkaTemplate.send("topic1", "hi, this is a message from Producer");
		};
	}

}
