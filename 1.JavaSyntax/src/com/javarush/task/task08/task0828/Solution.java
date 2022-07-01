package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> listMonth = new HashMap<>();
        listMonth.put("January","January is 1 month");
        listMonth.put("February","February is 2 month");
        listMonth.put("March","March is 3 month");
        listMonth.put("April","April is 4 month");
        listMonth.put("May","January is 5 month");
        listMonth.put("June","January is 6 month");
        listMonth.put("July","January is 7 month");
        listMonth.put("August","January is 8 month");
        listMonth.put("September","January is 9 month");
        listMonth.put("October","January is 10 month");
        listMonth.put("November","January is 11 month");
        listMonth.put("December","January is 12 month");

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String r = reader.readLine();

        for (Map.Entry<String,String> l :listMonth.entrySet()){

            String key = l.getKey();
            if (key==r){
                System.out.println(l.getValue());
                break;
        }
        }




        //напишите тут ваш код
    }
}
