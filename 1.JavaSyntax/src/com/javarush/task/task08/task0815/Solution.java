package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Галич", "Владислав");
        map.put("Саенко", "Александр");
        map.put("Топчтев", "Игорь");
        map.put("Лелюх", "Александр");
        map.put("Податель", "Алексей");
        map.put("Едушев", "Александр");
        map.put("Урсляк", "Игорь");
        map.put("Фалеев", "Юрий");

        return (HashMap<String, String>) map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int fn=0;

        for (Map.Entry<String,String> entry :map.entrySet()) {
            if (entry.getValue()==name){
                fn++;
            }
        }


        return fn;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int ln=0;

        for (Map.Entry<String,String> key: map.entrySet()) {
            if (key.getKey()==lastName){
                ln++;}

        }


        return ln;

        //напишите тут ваш код

    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameFirstName(createMap(),"Александр"));
        //System.out.println(getCountTheSameLastName(createMap(),"Саенко"));


    }
}
