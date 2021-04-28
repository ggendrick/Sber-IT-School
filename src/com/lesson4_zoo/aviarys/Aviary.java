package com.lesson4_zoo.aviarys;

import com.lesson4_zoo.animal.Animal;
import com.lesson4_zoo.exceptions.CapacityException;
import com.lesson4_zoo.exceptions.ContainsException;
import com.lesson4_zoo.exceptions.NotContainsException;

import java.util.ArrayList;
import java.util.HashSet;

public class Aviary extends ArrayList {
    private int size;
    private int capacity;
    HashSet<Animal> hashSet = new HashSet<>();
    public Aviary(int size){
        this.size=size;
        this.capacity=0;
    }
    public void add(Animal animal) throws CapacityException,ContainsException {
        if(capacity<size){
            if(!hashSet.contains(animal)){
            hashSet.add(animal);
                capacity++;
            }
            else throw new ContainsException();

        }
     else throw new CapacityException();
    }

    public void delete (Animal animal) throws NotContainsException {
        if(hashSet.contains(animal)){
            hashSet.remove(animal);
        }
        else throw new NotContainsException();
    }


}
