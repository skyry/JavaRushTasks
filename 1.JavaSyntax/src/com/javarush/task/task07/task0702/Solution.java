package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] m = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<=7;i++){
            m[i]=reader.readLine();}
            for (int p=9; p>=0; p--){
                System.out.println(m[p]);//напишите тут ваш код
        }
    }
}