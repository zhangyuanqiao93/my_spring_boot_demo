package com.tk.my_spring_boot_demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Create By Bridge On 2017/9/5
 * Function:
 * Description:
 */
@Service
public class AsyncTaskService {

    @Async//异步方法
    public void excuteAsync(Integer integer){
        System.out.println("异步任务： "  + integer);
    }

    @Async
    public void excuteAsyncPlus(Integer integer){
        System.out.println("异步任务+1： "  + (integer+1));
    }
}
