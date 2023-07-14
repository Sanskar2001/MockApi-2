package com.san.springdemo.BeanDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class CarShowRoom {

    @Autowired
    static Car car;

    public static void main(String[] args) {
       car.brake();
    }
}
