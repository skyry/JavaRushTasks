package com.javarush.task.task02.task0204;

/* 
О семейных отношениях
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;//напишите тут ваш код
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;



    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
