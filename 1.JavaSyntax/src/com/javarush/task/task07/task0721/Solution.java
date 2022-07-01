package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] m = new int[20];

        int maximum ;
        int minimum ;

        for (int i=0; i<m.length; i++){
            m[i] = Integer.parseInt(reader.readLine());
        }
        maximum = m[0];

        for (int i=1; i<m.length; i++){
            if (maximum>m[i]){
                continue;
            }
            else if (maximum<m[i]){
                maximum=m[i];
            }

        }
        minimum = m[0];

        for (int i=1; i<m.length; i++){

            if (minimum<m[i]){
                continue;
            }
            else if (minimum>m[i]) {
                minimum = m[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
