package com.StartThe;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Date: 2021/9/24 4:04 下午
 * com.StartThe.Application
 * Describe：
 */



@SpringBootApplication(scanBasePackages = "com.StartThe")

@MapperScan(basePackages={"com.AutomaticChat.mapper"},markerInterface = MySqlMapper.class)

//扫描所有包，以及相关组件包
@ComponentScan(basePackages =  {"org.example","org.n3r.idworker"})
@ComponentScan("config")
//开启定时任务
@EnableScheduling

public class Application {
    public static void main(String[] args){
        try{
            SpringApplication.run(Application.class,args);
        }catch (Throwable e){
            e.printStackTrace();
        }

    }
}
