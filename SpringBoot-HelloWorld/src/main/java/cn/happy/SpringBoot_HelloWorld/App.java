package cn.happy.SpringBoot_HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 * hhhhhhhhhhhhhhhhhhh
 */
@SpringBootApplication
@ComponentScan("cn.happy.SpringBoot_HelloWorld.controller")
public class App 
{
    public static void main( String[] args )
    {
         SpringApplication.run(App.class, args);
    }
}
