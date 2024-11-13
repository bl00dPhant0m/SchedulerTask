package org.example.shedulertask.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 Аннотация @Scheduled(cron = "0 44 15 * * ?") используется в Spring для планирования выполнения метода по определенному расписанию. Давайте разберем, что означает каждая часть cron-выражения "0 44 15 * * ?":

 0 — Секунда запуска (в данном случае 0, то есть в начале минуты).
 44 — Минута запуска (в данном случае 44 минута).
 15 — Час запуска (в данном случае 15, то есть 15:00 по 24-часовому формату).
 * — День месяца (* означает любой день).
 * — Месяц (* означает любой месяц).
 ? — День недели (? означает, что день недели не указан).
 */

@Component
public class CronScheduler {
    @Scheduled(cron = "0 44 15 * * ?")
    public void schedulerTaskUsingCronExpression() {
        System.out.println("Задача выполняется каждый день в 15:44");
    }
}
