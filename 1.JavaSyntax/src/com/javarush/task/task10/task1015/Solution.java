package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        String a = "Привет Амиго!";
        ArrayList<String> lst1 = new ArrayList<String>();
        lst1.add(a);
        ArrayList<String> lst2 = new ArrayList<>();
        lst2.add(a);
        ArrayList<String>[] array = new ArrayList[2];
        array[0]=lst1;
        array[1]=lst2;


        //напишите тут ваш код

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}