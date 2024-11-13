package org.example.shedulertask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShedulerTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShedulerTaskApplication.class, args);


//
//        try {
//            Thread.sleep(1000);
//            System.out.println("Загрузка доп данных..");
//
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Загрузка завершена");

   }

}
