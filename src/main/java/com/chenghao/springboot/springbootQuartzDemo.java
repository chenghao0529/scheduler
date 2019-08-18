package com.chenghao.springboot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 程昊 on 2019/8/11.
 */
@Component
public class springbootQuartzDemo  {
    @Scheduled(cron = "0 41 23 11 8 ? ")
    private void test() {
        System.out.println("springbootQuartzDemo定时任务开启");
    }
}
