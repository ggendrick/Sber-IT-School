package com.lesson3_group2.p2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        String str = scanner.next();
        if((str.length()<x+2)&&(y>2)){
            for(int i=0;i<x;i++){
                System.out.print("*"); //1 строка
            }
            System.out.println();
            int temp1=(y-1)/2;
            for (int j=1;j<temp1;j++){ //строки со 2 до строки с текстом
                System.out.print("*");
                for (int i=1;i<x-1;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }

            System.out.print("*");  //строка с текстом
            int temp=(x-2-str.length())/2;
            for(int i=0;i<temp;i++){
                System.out.print(" ");
            }
            System.out.print(str);
            for(int i=0;i<(x-temp-2-str.length());i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            for (int j=1;j<y-temp1-1;j++){ //строки со 2 до строки с текстом
                System.out.print("*");
                for (int i=1;i<x-1;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }
            for(int i=0;i<x;i++){
                System.out.print("*"); //1 строка
            }




        }
        else{
            System.out.println("Ошибка");
        }
    }

}