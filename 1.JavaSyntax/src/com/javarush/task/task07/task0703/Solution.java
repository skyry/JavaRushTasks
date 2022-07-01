package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        Integer[] n = new Integer[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<s.length; i++){
            s[i]=reader.readLine();
        }
        for (int j=0; j<s.length; j++){
            n[j] = s[j].length();
            System.out.println(n[j]);
        }



        //напишите тут ваш код
    }
}
