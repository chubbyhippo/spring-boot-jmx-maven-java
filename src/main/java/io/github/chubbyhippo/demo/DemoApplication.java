package io.github.chubbyhippo.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {

    @SuppressWarnings("UnnecessaryModifier") // need public for mvn spring-boot:run
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ApplicationRunner keepRunning() {
        return _ -> TimeUnit.HOURS.sleep(1);
    }

}
