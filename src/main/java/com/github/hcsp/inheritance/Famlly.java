package com.github.hcsp.inheritance;

public class Famlly {
    public String name;
    public int age;

    public Famlly(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
