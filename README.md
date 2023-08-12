This is a project of Kafka- Producer and Consumer using SpringBoot, which implements a custom-Configuration class for both Producer and Consumer.
Instead of using application.properties file to define the configurations like bootstrap servers, properties of both Producer and Consumer which include - key and value serializer and deserializer respectively, this has 

a Producer configuration class which invloves -
i) a method to create a map of properties that would be set to a KakfaProducer instance.
ii) a ProducerFactory type method to get a Kafka_producer instance of type- DefaultKafkaProducerFactory.
iii) Use this Kafka-Producer instance to create a KafkaTemplate to send messages.

a Consumer configuration class which invloves -
i) a method to create a map of properties that would be set to a KakfaConsumer instance.
ii) a ConsumerFactory type method to get a Kafka_consumer instance of type- DefaultKafkaConsumerFactory.
iii) a KafkaListenerContainerFactory type method to get a factory of type- ConcurrentKafkaListenerContainerFactory, which has an instance
      of kafka_consumer set to it.

