package com.app.greet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

@SpringBootApplication
public class GreetingApplication {
    static Logger LOGGER = Logger.getLogger("DemoApplication.class");

    public static void main(String[] args) {

        LOGGER.info("Starting DemoApplication ...");
        SpringApplication.run(GreetingApplication.class, args);
        LOGGER.info("Started DemoApplication ...");
    }

}
