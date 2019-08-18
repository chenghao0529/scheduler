package com.chenghao.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by 程昊 on 2019/8/10.
 */
//创建作业类，公司具体业务
public class Myjob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("开启quartz任务");
    }
}
