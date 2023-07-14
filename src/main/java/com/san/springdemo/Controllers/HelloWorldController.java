package com.san.springdemo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


class Student
{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.name+" "+this.rollNo;
    }
}
@RestController
public class HelloWorldController {


    @RequestMapping(method = RequestMethod.GET,path = "/")
    public String getResponse()
    {
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/test")
    public Student getStudent()
    {
        Student s=new Student(10,"Mahesh");
        System.out.println(s);
        return s;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/demo")
    public String getDemo()
    {
        return "Demo running...";
    }

    @GetMapping(path = "/hi")
    public  String getMessage()
    {
        return "Hello There";
    }

}
