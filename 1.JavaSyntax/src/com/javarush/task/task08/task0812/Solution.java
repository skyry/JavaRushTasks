package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m=0;
        int n=0;


        for (int i=0; i<10; i++){
            list.add(Integer.parseInt(reader.readLine()));
                    }

        for (int i=0; i<list.size()-1; i++){
            if (list.get(i)==list.get(i+1)){
                ++m;
                if (m==1) m=2;
                if (n<m) n=m;
            }
            else m=1;
            if (n<m) n=m;
         }
        System.out.println(n);

    }
}