package org.example.kafkaEx;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class MultiConsumer {

    private static final String TOPIC = "mytopic";
    private static final String BOOTSTRAP_SERVERS = "localhost:9092";

    public static void main(String[] args) {

        Producer<String, String> producer = createProducer();

        Thread producerThread = new Thread(() -> {
            try {
                produceMessages(producer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();


        for (int i = 0; i < 3; i++) {
            Consumer<String, String> consumer = createConsumer(); 
            Thread consumerThread = new Thread(() -> consumeMessages(consumer));
            consumerThread.start();
        }
    }

    private static Producer<String, String> createProducer() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        return new KafkaProducer<>(props);
    }

    private static Consumer<String, String> createConsumer() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");


        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");

        return new KafkaConsumer<>(props);
    }

    private static void produceMessages(Producer<String, String> producer) throws InterruptedException {
        int messageNumber = 1;
        while (true) {
            String message = "Message " + messageNumber++;
            producer.send(new ProducerRecord<>(TOPIC, message));
            System.out.println("Produced: " + message);
            Thread.sleep(1000);
        }
    }

    private static void consumeMessages(Consumer<String, String> consumer) {

        consumer.subscribe(Collections.singletonList(TOPIC));

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            records.forEach(record -> System.out.println("Listened by Consumer thread " + Thread.currentThread().getId() +
                    ": " + record.value()));
        }
    }
}
