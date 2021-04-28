package com.balda;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static boolean temp = true;
    static HashSet<Character> ltrs = new HashSet();
    static HashSet<String> words = new HashSet();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите слово");
        String word = scanner.nextLine();


        System.out.println("введите имя первого игрока");
        String player1=scanner.nextLine();
        System.out.println("введите имя второго игрока");
        String player2=scanner.nextLine();
        String inputWord = "";
        String inputWord2 = "";
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        for (int i = 0; i < word.length(); i++) {
            ltrs.add(word.charAt(i));
        }
        boolean game = true;
        while (game) {


            System.out.println(player1+", введите слово");
            inputWord = scanner.nextLine();
            if(!inputWord.isEmpty())
                scorePlayer1=foo(inputWord,scorePlayer1);

            System.out.println(player2+", введите слово");
            inputWord2 = scanner.nextLine();
            if(!inputWord2.isEmpty())
                scorePlayer2=foo(inputWord2,scorePlayer2);
            if(inputWord.isEmpty()&&inputWord2.isEmpty()){
                game=false;
            }


        }
        System.out.println("Игра окончена, "+player1+" : "+scorePlayer1+", "+player2+" : "+scorePlayer2);

    }

    public static int foo(String inputWord,int scorePlayer){
        temp=true;
        if (words.contains(inputWord)) {

            System.out.println("Слово уже было введено");
        }


        else {
            for (int i = 0; i < inputWord.length(); i++) {
                if (!ltrs.contains(inputWord.charAt(i))) {
                    temp = false;
                }
            }
            if (temp) {
                System.out.println("Слово принято");
                words.add(inputWord);
                scorePlayer += inputWord.length();

            } else {
                System.out.println("нет таких букв");
            }

        }
            return  scorePlayer;
        }
    }



