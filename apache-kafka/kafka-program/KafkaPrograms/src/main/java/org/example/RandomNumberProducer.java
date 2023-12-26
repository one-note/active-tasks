package org.example;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;

public class RandomNumberProducer {

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("group.id", "test-group");

        Producer<String, String> producer = new KafkaProducer<>(properties);


        String topic = "test-topic";


        Random random = new Random();


        try {
            for (int i = 0; i < 10; i++) {

                int randomNumber = random.nextInt(100);


                ProducerRecord<String, String> record = new ProducerRecord<>(topic, null, Integer.toString(randomNumber));


                producer.send(record);


                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } finally {

            producer.close();
        }
    }
}
