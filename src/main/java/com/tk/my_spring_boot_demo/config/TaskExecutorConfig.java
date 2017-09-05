package com.tk.my_spring_boot_demo.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Create By Bridge On 2017/9/5
 * Function:
 * Description:
 */

@Configuration
@ComponentScan(basePackages = {"com.tk.my_spring_boot_demo.*"})
//扫描包的时候扫描不出，可以尝试使用*,但是最好是指定到具体的包中。
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {//


    @Override
    public Executor getAsyncExecutor() {

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
