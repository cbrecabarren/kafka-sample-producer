package com.medimoz.kafka.sampleProducer;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Properties;

public class SampleProducer {
    public static void main(String[] args) {
        System.out.println("Hola");

        Properties kafkaProps = new Properties();

        kafkaProps.put("bootstrap.servers", "127.0.0.1:9092");
        kafkaProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<>(kafkaProps);

        System.out.println(producer);
    }
}
