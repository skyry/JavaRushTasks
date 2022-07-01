package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Markov",new Date("july 23 1983"));
        map.put("Nazirov", new Date("august 15 1986"));
        map.put("Sokolov", new Date("september 6 1983"));
        map.put("Sidorov", new Date("september 23 1980"));
        map.put("Ivanov",new Date("may 28 1985"));
        map.put("Petrov", new Date("october 11 1990"));
        map.put("Duroz",new Date("october 5 1991"));
        map.put("Drozdov", new Date("april 21 1995"));
        map.put("Zajcev", new Date("april 11 1981"));

        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> m = map.entrySet().iterator();
        while (m.hasNext()){
            Map.Entry<String,Date> d = m.next();
            if (d.getValue().getMonth()>4&&d.getValue().getMonth()<8){
                m.remove();
            }


        }

    }

    public static void main(String[] args) {



    }
}
