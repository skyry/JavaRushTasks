package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        //System.out.println(integerList);
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int m = array.get(0);
        for (int i=0; i<array.size(); i++) {
            if (array.get(i)<m){
                m=array.get(i);
            }
        }
        // find minimum here — найти минимум тут
        return m;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        //create and initialize a list here - создать и заполнить список тут
        return list;
    }
}
