package com.microservices.exercises.publisher;

import com.microservices.exercises.publisher.services.PublisherService;
import com.microservices.exercises.publisher.services.SubscriberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Our main configuration class
 * @author Lucas Dias
 * @since 2021-05-06 11:53
 */
@Configuration
public class Config {

    @Bean
    public PublisherService publisherServiceBean() {
        return new PublisherService();
    }

    @Bean
    public SubscriberService subscriberServiceBean() {
        return new SubscriberService();
    }

}
