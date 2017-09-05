package com.tk.my_spring_boot_demo.common;

import com.tk.my_spring_boot_demo.config.TaskSchedulerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create By Bridge On 2017/9/5
 * Function:
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        //AsyncTaskService service = context.getBean(AsyncTaskService.class);

    }
}
