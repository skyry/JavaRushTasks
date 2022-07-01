package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Zapo",300);
        map.put("Zoro",550);
        map.put("Ivanov",650);
        map.put("Gudkov",1000);
        map.put("Vasilenko",105);
        map.put("Koval",200);
        map.put("Sinica",780);
        map.put("Zaycev",2000);
        map.put("Volkov",300);
        map.put("Dok",800);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> copy = new HashMap<>(map);

        for (Map.Entry<String,Integer> d: copy.entrySet()){
            if (d.getValue()<500){
                map.remove(d.getKey());
            }
        }

        //напишите тут ваш код
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());


    }
}