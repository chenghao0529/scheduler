package com.chenghao.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 程昊 on 2019/8/10.
 */
public class TimerDemo {
    public static void main(String[] args) {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer1的定时任务");
            }
        }, 0, 1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //模拟某一定时任务出现异常情况
                int a = 1/0;
                System.out.println("timer2的定时任务");
            }
        },0,1000);
    }
}
