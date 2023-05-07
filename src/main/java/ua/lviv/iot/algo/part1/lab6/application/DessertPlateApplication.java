package ua.lviv.iot.algo.part1.lab6.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.algo.part1.lab6.controller",
        "ua.lviv.iot.algo.part1.lab6.service"})
public class DessertPlateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DessertPlateApplication.class, args);
    }

}
