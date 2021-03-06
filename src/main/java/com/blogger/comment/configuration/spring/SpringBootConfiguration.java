package com.blogger.comment.configuration.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Configuration Class for Spring Boot. TODO Actually the @SpringBootApplication
 * annotation is equivalent to using @Configuration, @EnableAutoConfiguration
 * and @ComponentScan with their default attributes.
 *
 * @author Rohit
 * @version 1.0
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.blogger.comment"})
@EntityScan(basePackages = {"com.blogger.comment.document"})
@EnableMongoRepositories(basePackages = {"com.blogger.comment.repository"})
public class SpringBootConfiguration extends SpringBootServletInitializer {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        SpringApplication.run(SpringBootConfiguration.class, args);
    }

    /**
     *
     */
    @Override
    protected SpringApplicationBuilder configure(
            final SpringApplicationBuilder application) {
        return application.sources(SpringBootConfiguration.class);
    }
}
