package com.lesson7;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyInteger2 implements Comparable<MyInteger2> {
    private int value;
    MyInteger2(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public int compareTo(MyInteger2 o) {
        String s1 = ((Integer)(this.getValue())).toString();
        String s2 = ((Integer)(o.getValue())).toString();
        Set set1=new HashSet();
        set1 = Stream.of(String.valueOf(this.getValue()).split("")).collect(Collectors.toSet());
        Set set2=new HashSet();
        set2 = Stream.of(String.valueOf(o.getValue()).split("")).collect(Collectors.toSet());
        return set1.size()-set2.size();
    }
}
