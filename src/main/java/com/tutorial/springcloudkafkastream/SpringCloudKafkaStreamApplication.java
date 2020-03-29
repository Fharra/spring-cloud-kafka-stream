package com.tutorial.springcloudkafkastream;

import static org.springframework.boot.SpringApplication.*;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudKafkaStreamApplication {

	@Bean
	public java.util.function.Consumer<KStream<Object, String>> process() {

		return input ->
			input.foreach((key, value) -> {
				System.out.println("Key: " + key + " Value: " + value);
			});
	}

}
