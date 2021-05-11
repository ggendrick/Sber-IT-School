package com.lesson7;

public class Main {
    public static void main(String[] args) {

        MyInteger1 num1 = new MyInteger1(7);
        MyInteger1 num2 = new MyInteger1(10);
        MyInteger1 num3 = new MyInteger1(11);
        MyInteger1 num4 = new MyInteger1(50);
        System.out.println(num1.compareTo(num2));//-2
        System.out.println(num1.compareTo(num3));//0
        System.out.println(num2.compareTo(num4));//0 делители, которые встречаются несколько раз не учитываем
        MyInteger2 num11=new MyInteger2(3);
        MyInteger2 num12=new MyInteger2(13);
        MyInteger2 num13=new MyInteger2(123);
        MyInteger2 num14=new MyInteger2(111);
        System.out.println(num11.compareTo(num14));
        System.out.println(num12.compareTo(num13));
        System.out.println(num13.compareTo(num14));


    }
















}
