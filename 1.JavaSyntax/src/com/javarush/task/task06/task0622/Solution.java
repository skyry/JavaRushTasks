package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int[5];
        int max;
        for (int n=0; n<num.length; n++){
            num[n] = Integer.parseInt(reader.readLine());
        }
        for (int i=num.length-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j] > num[j + 1]) {
                    max = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = max;
                }
            }
        }



        //напишите тут ваш код

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);

    }
}
