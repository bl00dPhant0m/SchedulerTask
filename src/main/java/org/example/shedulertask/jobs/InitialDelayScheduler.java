package org.example.shedulertask.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class InitialDelayScheduler {
    @Scheduled(fixedRate = 7000, initialDelay = 5000)
    public void schedulerTaskWithInitialDelay() {
        System.out.println("Задача выполняется каждые 7 сек. с начальной задержкой в 5 сек.");
    }
}
