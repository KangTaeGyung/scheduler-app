package org.example.schedulerapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @fileName : SchedulerService
 * @author : GGG
 * @since  : 2024-05-30
 * description : 스케줄러 샘플 예제
 *    @Scheduled(fixedDelay = 1000)
 *    => 1초 마다 실행
 *    * 속성
 *     - fixedDelay   : 작업을 마친 후부터 특정 시간마다 실행
 *     - initialDelay : 초기 지연시간 설정
 *     - cron         : cron 표기법 사용 가능
 *       ex) @Scheduled(cron = "* * * * *")
 *         => 매일 매초 실행됨
 *
 *    * 스케줄러 제한사항
 *    1) 스케줄러는 IOC 대상만 가능함
 *    2) 메소드의 리턴타입은 void
 *    3) 메소드의 매개변수 사용불가
 *    ex) void 함수명(){ 스케줄실행문; }
 */
@Slf4j
@Service
public class SchedulerService {

    @Scheduled(fixedDelay = 2000)
    public void run() {
        log.debug("스케줄 예제입니다.");
    }
}
