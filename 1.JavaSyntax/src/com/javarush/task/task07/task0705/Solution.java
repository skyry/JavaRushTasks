package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        int j = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<big.length; i++){
            big[i]=Integer.parseInt(reader.readLine());
            //напишите тут ваш код
        }

        for (int i=0; i<10; i++){
            small1[i] = big[i];
        }

        for (int i=10; i<20; i++ ){
            small2[j]=big[i];
            System.out.println(small2[j]);
            j++;


        }


    }
}
