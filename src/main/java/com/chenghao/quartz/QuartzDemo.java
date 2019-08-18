package com.chenghao.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by 程昊 on 2019/8/10.
 */
public class QuartzDemo {
    public static void main(String[] args) throws SchedulerException {
        //创建jobDetail,与job业务类进行绑定
        JobDetail jobDetail = JobBuilder.newJob(Myjob.class).withIdentity("job").build();
        //创建触发器Trigger startNow()立即执行  withSchedule() 加入执行时间
        //SimpleTrigger myTrigger = TriggerBuilder.newTrigger().withIdentity("myTrigger").startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3).repeatForever()).build();
        CronTrigger myTrigger = TriggerBuilder.newTrigger().withIdentity("myTrigger1").withSchedule(CronScheduleBuilder.cronSchedule("* * * * * ? ")).build();
        //创建schedule实例
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,myTrigger);

    }
}