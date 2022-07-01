package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] num = new int[5];
        for (int n=0; n<num.length; n++){
            num[n] = Integer.parseInt(reader.readLine());
                    }


        //напишите тут ваш код

        System.out.println(num);
    }
}
