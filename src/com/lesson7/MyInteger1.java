package com.lesson7;


public class MyInteger1 implements Comparable<MyInteger1> {
    private int value;
    MyInteger1(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }






    @Override
    public int compareTo(MyInteger1 o) {
        int counta=0,countb=0;
        counta=dividecounter(this.getValue());
        countb=dividecounter(o.getValue());

        return (counta-countb);
    }
    private int dividecounter(int num){
        int count=0;
        for(int i=2;i<num;i++){

            if(num%i==0&&dividecounter(i)==0){
                count++;
            }

        }
        return count;

    }
}
