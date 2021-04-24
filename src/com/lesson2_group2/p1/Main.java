package com.lesson2_group2.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String q = scanner.next();

        int b = scanner.nextInt();
        switch (q){
            case "+":
                System.out.println(a+b);
                break;
            case  "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                try {
                    int c=a/b;
                    System.out.println(c);
                }catch (Exception e){
                    System.out.println("на 0 делить нельзя!");
                }
                break;
            default:
                System.out.println("неверный оператор");



        }

}

}
