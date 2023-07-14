package com.san.springdemo.BeanDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CarImpl{

   @Bean
    public Car BMW()
   {
       return new BMW();
   }



}

