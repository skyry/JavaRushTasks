package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] n = new int[10];
        int j=9;
        int temp=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<n.length; i++){
            n[i] = Integer.parseInt(reader.readLine());
            //напишите тут ваш код
        }
        for (int x=0; x<=4; x++){
            temp=n[j];
            n[j]=n[x];
            n[x]=temp;
            j--;
        }

        for (int f=0;f<n.length;f++)
        System.out.println(n[f]);

    }
}

