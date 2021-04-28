package com.lesson4_zoo;

import com.lesson4_zoo.animal.*;
import com.lesson4_zoo.aviarys.Aviary;
import com.lesson4_zoo.exceptions.CapacityException;
import com.lesson4_zoo.exceptions.ContainsException;
import com.lesson4_zoo.exceptions.NotContainsException;
import sun.security.mscapi.CPublicKey;

public class Main {
   public static Aviary aviary1 = new Aviary(3);
    public static Aviary aviary2 = new Aviary(7);
    public static void main(String[] args) {

        Animal bear1 = new Bear();
        Bear bear2 = new Bear();
   //     System.out.println(bear1.getName());
   //     System.out.println(bear2.getName()); //конструктор по умолчанию никогда не вызовется
   //     bear1.say();
    //    bear1.eat();
        bear1.setName("Мишаня");
    //    System.out.println("Имя животного: "+bear1.getName());
        Turtle turtle = new Turtle(123);
   //     System.out.println(turtle.getName());
        Monkey monkey = new Monkey("макака буби");
        add(aviary1,bear1);
        add(aviary1,bear2);
        add(aviary1,turtle);
        add(aviary1,monkey);//Exception, закончилось место
        delete(aviary1,monkey);//Exception, нет такого объекта
        add(aviary2,bear1);
        add(aviary2,bear1);//Exception, такой объект уже добавлен






    }

    static void add(Aviary aviary,Animal animal){
        try {
            aviary.add(animal);
        }catch (CapacityException e){
            e.message();
        }catch (ContainsException e){
            e.message();
        }
    }

   static void delete(Aviary aviary,Animal animal){
        try {
            aviary.delete(animal);
        }catch (NotContainsException e){
            e.message();
        }
    }




}

