package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String a= null;


        for (int i=0; i<5; i++){
            list.add(reader.readLine());
            //напишите тут ваш код
        }
        for (int i=0; i<13; i++){
            a=list.get(4);
            list.remove(4);
            list.add(0,a);

        }

        for (String s: list){
            System.out.println(s);
        }

    }

}
