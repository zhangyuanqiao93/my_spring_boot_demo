package com.tk.my_spring_boot_demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create By Bridge On 2017/9/5
 * Function:
 * Description:
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//计划任务，使用fixedRate属性每间隔固定时间执行
    public void reportCurrentTime(){
        System.out.println("每间隔5秒执行一次： " +  dateFormat.format(new Date()));


    }

    @Scheduled(cron = "0 28 11 ? * *")//每天11:28分执行，其中cron是UNIX和类UNIX(Linux)系统下的定时任务
    public void fixTimeExecution(){

        System.out.println("在指定时间" + dateFormat.format(new Date())+"执行");

    }
}
