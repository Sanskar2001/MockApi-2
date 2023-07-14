package com.san.springdemo.BeanDemo;

public class Audi implements Car {

    String name="Audi";
    @Override
    public void move() {
        System.out.println("Audi Moving.");
    }

    @Override
    public void brake() {
        System.out.println("Audi Brake");
    }
}
