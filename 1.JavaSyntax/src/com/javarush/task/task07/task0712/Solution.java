package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int maxindex = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() > list.get(maxindex).length())
                maxindex = list.indexOf(list.get(i));
        }
        int minindex = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < list.get(minindex).length()){
                minindex = list.indexOf(list.get(i));
            }
        }
        if (minindex < maxindex){
            System.out.println(list.get(minindex));
        }
        else System.out.println(list.get(maxindex));
        }

    }
