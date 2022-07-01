package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> all = new ArrayList<Integer>(); //главный список
        ArrayList<Integer> thre = new ArrayList<Integer>(); //число нацело делится на 3
        ArrayList<Integer> two = new ArrayList<Integer>();  //число нацело делится на 2
        ArrayList<Integer> other = new ArrayList<Integer>(); //все остальные числа из главного


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            all.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < all.size(); i++) {
            int x = all.get(i);
            if (x % 3 == 0) {
                thre.add(x);
            }
            if (x % 2 == 0) {
                two.add(x);
            }
            if (x%3!=0 & x%2!=0){other.add(x);}
        }

        //printList(all);
        printList(thre);
        printList(two);
        printList(other);


    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
