package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] str = s.toCharArray();
        for (int i=0; i<str.length-1; i++){
            str[0] = Character.toUpperCase(str[0]);
            if (str[i]==' '){
                str[i+1] = Character.toUpperCase(str[i+1]);
            }
        }

        System.out.println(str);

        //напишите тут ваш код
    }
}
