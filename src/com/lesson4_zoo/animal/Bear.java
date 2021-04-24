package com.lesson4_zoo.animal;

public class Bear extends Animal {

    public Bear(){
        super("неизвестный медведь");
    }

    public Bear(String name) {
        super(name);
    }
    public Bear(int name){super(name);}

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
        System.out.println("я ем мясо");
    }


    @Override //различный для всех метод
    public void moove(){
        System.out.println("я иду");

    }

    @Override
    public void sleep() {
        System.out.println("я сплю");
    }

    @Override
    public void say() {
        System.out.println("я сплю");
    }



}
