package org.example;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class RandomNumberConsumer {




        public static void main(String[] args) {

            Properties properties = new Properties();
            properties.put("bootstrap.servers", "localhost:9092");
            properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            properties.put("group.id", "test-group");


            Consumer<String, String> consumer = new org.apache.kafka.clients.consumer.KafkaConsumer<>(properties);


            String topic = "test-topic";
            consumer.subscribe(Collections.singletonList(topic));


            Duration pollDuration = Duration.ofMillis(100);
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(pollDuration);
                records.forEach(record -> {
                    System.out.printf("Received message: Key = %s, Value = %s%n", record.key(), record.value());
                });
            }
        }
    }











