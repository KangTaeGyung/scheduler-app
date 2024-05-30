package org.example.schedulerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * @fileName : SchedulerAppApplication
 * @author : GGG
 * @since  : 2024-05-30
 * description :  @EnableScheduling을 추가 (스케줄링 시작)
 */
@EnableScheduling
@SpringBootApplication
public class SchedulerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerAppApplication.class, args);
    }

}
