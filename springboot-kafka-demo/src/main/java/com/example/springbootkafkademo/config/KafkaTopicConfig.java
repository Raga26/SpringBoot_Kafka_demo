package com.example.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic webDevTopic(){
        return TopicBuilder.name("webDev")
                .build();
    }
    @Bean
    public NewTopic webDevJsonTopic(){
        return TopicBuilder.name("webDev_json")
                .build();
    }
}
