package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Ivanov", "Pavel");
        map.put("Zaycev", "Ivan");
        map.put("Zaycev", "Pavel");
        map.put("Zub", "Taras");
        map.put("Ivanec", "Pasha");
        map.put("Antonov","Dmitrij");
        map.put("Galich", "Vladislav");
        map.put("Truhanov", "Slavik");
        map.put("Mozart", "Toxa");



        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
