package com.lesson4_zoo.animal;

public class Turtle extends Animal {

    public Turtle(){
        super("неизвестная черепаха");
    }

    public Turtle(String name) {
        super(name);
    }
    public Turtle(int name){super(name);}
    @Override //общий метод
    public void setName(String name) {
        this.name=name;
    }

    @Override //общий метод
    public String getName() {
        return this.name;
    }

    @Override //различный для всех метод
    public void eat() {
        System.out.println("я ем растения");
    }


    @Override //различный для всех метод
    public void moove(){
        System.out.println("я ползу");

    }

    @Override //различный для всех  метод
    public void say() {
        System.out.println("я молчу");
    }

    @Override
    public void sleep() {
        System.out.println("я сплю");
    }



}
