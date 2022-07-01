package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=1; i<=20; i++){
            set.add(i);
        }


        return (HashSet<Integer>) set;


        //напишите тут ваш код

    }


    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator =set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10){iterator.remove();
                //напишите тут ваш код
            }
        }
        return set;

    }

    public static void main(String[] args) {



    }
}
