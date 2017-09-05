package com.tk.my_spring_boot_demo.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

//import org.apache.commons.io.IOUtils;

/**
 * Create By Bridge On 2017/9/5
 * Function:
 * Description:
 */

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;


    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){

        System.out.println("Bean`s name : " + beanName);

        Resource resource = loader.getResource("classpath:com/tk/my_spring_boot_demo/test.txt");

//        try {
        System.out.println("ResourceLoader加载的内容是：" +  resource.toString() );
//        } catch (IOException e) {
////            e.printStackTrace();
//        }
    }
}
