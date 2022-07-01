package com.javarush.task.task08.task0817;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Zapo","Ivan");
        map.put("Zoro","Viktor");
        map.put("Ivanov","Petr");
        map.put("Gudkov","Pavel");
        map.put("Vasilenko","Ivan");
        map.put("Koval","Viktor");
        map.put("Sinica","Aleksandr");
        map.put("Zaycev","Nikolay");
        map.put("Volkov","Aleksandr");
        map.put("Dok","Ivan");
        return map;
    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, Integer> del = new HashMap<>();

        for (String asd: map.values()) {
            if (del.get(asd)!=null) {
                del.put(asd,(del.get(asd)+1));
            }
            else del.put(asd,1);




        }

        for (Map.Entry<String,Integer> d:del.entrySet())
            if (d.getValue()>1){
            removeItemFromMapByValue(map,d.getKey());
            }
        System.out.println(map);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       removeTheFirstNameDuplicates(createMap());



    }
}
