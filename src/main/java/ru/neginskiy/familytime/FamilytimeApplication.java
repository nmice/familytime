package ru.neginskiy.familytime;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FamilytimeApplication {

    public static void main(String[] args) throws Exception {
        Console.main(args);
        SpringApplication.run(FamilytimeApplication.class, args);
    }
}
