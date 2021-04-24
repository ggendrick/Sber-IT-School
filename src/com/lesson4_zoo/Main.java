package com.lesson4_zoo;

import com.lesson4_zoo.animal.*;


public class Main {

    public static void main(String[] args) {

        Animal bear1 = new Bear();
        Bear bear2 = new Bear();
        System.out.println(bear1.getName());
        System.out.println(bear2.getName()); //конструктор по умолчанию никогда не вызовется
        bear1.say();
        bear1.eat();
        bear1.setName("Мишаня");
        System.out.println("Имя животного: "+bear1.getName());
        Turtle turtle = new Turtle(123);
        System.out.println(turtle.getName());

    }
}

