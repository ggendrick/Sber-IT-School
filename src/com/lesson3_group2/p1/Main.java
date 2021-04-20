package com.lesson3_group2.p1;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int a = ThreadLocalRandom.current().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        boolean status = true;
        while(status){
        b = scanner.nextInt();
        if(b>a){


            System.out.println("Меньше!");
        }
        else if(a>b){
            System.out.println("Больше!");
        }
        else{ System.out.println("Верно!");
        status=false;
        }
        }
    }
}

