package com.tk.my_spring_boot_demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Create By Bridge On 2017/9/5
 * Function: TaskSchedulerConfig
 * Description:
 */

@Configuration
@ComponentScan(basePackages = "com.tk.my_spring_boot_demo.*")
@EnableScheduling//开启计划
public class TaskSchedulerConfig {
}
