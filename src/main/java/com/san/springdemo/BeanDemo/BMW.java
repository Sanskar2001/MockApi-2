package com.san.springdemo.BeanDemo;

public class BMW implements Car {


    public String name="BMW";

    @Override
    public void move() {
        System.out.println("BMW Moving");
    }

    @Override
    public void brake() {
        System.out.println("BMW brake");
    }
}
