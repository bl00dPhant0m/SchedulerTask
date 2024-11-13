package org.example.shedulertask.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeeklyCroneScheduler {
    @Scheduled(cron = "0 5 16 * * MON,WED")
    public void schedulerWeeklyTask(){
        System.out.println("Задача выполняется каждый понедельник и среду в 16:05");
    }
}
