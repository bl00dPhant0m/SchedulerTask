package org.example.shedulertask.jobs;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @EnableAsync
 *  @Async
 *  Запуск асинхронно чтоб не занимать главный поток
 */


@Component
@EnableAsync
public class FixRateScheduler {
    @Scheduled(fixedRate = 5000)
    @Async
    public void schedulerFixRateTask(){
        System.out.println("Задача выполняется каждые 15 сек.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Задача выполнена");
    }
}
