package com.lesson2_group2.p2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //нумерация с единицы
        String a = scanner.next();
        int b = scanner.nextInt();
        System.out.println(a.charAt(b-1));

}

}
