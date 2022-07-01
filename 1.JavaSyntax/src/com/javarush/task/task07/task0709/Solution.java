package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int min=100;

        for (int i=0; i<5; i++){
            strings.add(reader.readLine());

            min = ((strings.get(i).length())<min) ? strings.get(i).length():min;}

            for (String s : strings){
                if (s.length() == min){
                    System.out.println(s);
                }

            }
            //напишите тут ваш код
        }
    }

