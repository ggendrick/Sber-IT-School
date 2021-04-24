package com.lesson2_group2.p3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String num = scanner.next();
        int min=10,max=-1;
        if(s.equals("min")){
            for(int i =0;i<num.length();i++){
                if( (Integer.parseInt(num.substring(i,i+1)))<min){
                    min=Integer.parseInt(num.substring(i,i+1));
                }
            }
            System.out.println("min "+min);
        }

        if(s.equals("max")){
            for(int i =0;i<num.length();i++){
                if( (Integer.parseInt(num.substring(i,i+1)))>max){
                    max=Integer.parseInt(num.substring(i,i+1));
                }
            }
            System.out.println("max "+max);

        }

}

}
