package com.javarush.task.task09.task0927;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
       HashMap<String, Cat> map = new HashMap<>();
       map.put("Vaska",new Cat("Vaska"));
       map.put("Timka",new Cat("Timka"));
       map.put("Sonka",new Cat("Sonka"));
       map.put("Toxa", new Cat("Toxa"));
       map.put("Tishka",new Cat("Tishka"));
       map.put("Kuzka",new Cat("Kuzka"));
       map.put("Bars",new Cat("Bars"));
       map.put("Ritz", new Cat("Ritz"));
       map.put("Volf",new Cat("Volf"));
       map.put("Dog",new Cat("Dog"));

       return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet set=new HashSet(map.values());

        return set;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
