package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String name2;
        private int age;
        private int weight;
        private boolean sex;
        private String adress;

        public Human(String name, String name2) {
            this.name = name;
            this.name2 = name2;
        }

        public Human(String name, String name2, int age) {
            this.name = name;
            this.name2 = name2;
            this.age = age;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String name2, int age, int weight, boolean sex, String adress) {
            this.name = name;
            this.name2 = name2;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.adress = adress;
        }

        public Human(String name, String name2, int age, int weight, boolean sex) {
            this.name = name;
            this.name2 = name2;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String name2, int age, boolean sex) {
            this.name = name;
            this.name2 = name2;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, int weight, boolean sex, String adress) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.adress = adress;
        }

        public Human(String name2, int age, int weight, boolean sex) {
            this.name2 = name2;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, int weight, boolean sex) {
            this.name = name;
            this.weight = weight;
            this.sex = sex;
        }

        public Human( String name2, int age, int weight, String adress) {
            this.name2 = name2;
            this.age = age;
            this.weight = weight;
            this.adress = adress;
        }


       // напишите тут ваши переменные и конструкторы
    }
}
