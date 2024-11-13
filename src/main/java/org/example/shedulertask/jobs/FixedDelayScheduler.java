package org.example.shedulertask.jobs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedDelayScheduler {

    @Scheduled( fixedDelayString = "${task.scheduler.fixed}")
    public void fixedDelaySchedule() {
        System.out.println("Каждые 2 секунды после завершения предидущей");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Задача завершена");
    }

}
