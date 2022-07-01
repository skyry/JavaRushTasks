package com.javarush.task.task07.task0724;

/* 
Семейная перенепись
*/

public class Solution {
    public static void main(String[] args) {
        Human h1 = new Human("Василий",true, 75);
        Human h2 = new Human("Игорь", true, 78);
        Human h3 = new Human("Анна", false, 65);
        Human h4 = new Human("Лариса", false,59);
        Human h5 = new Human("Иван", true,49, h1,h3);
        Human h6 = new Human("Анжела", false,45,h2,h4);
        Human h7 = new Human("Инна", false,25,h5,h6);
        Human h8 = new Human("Виктор", true,29,h5,h6);
        Human h9 = new Human("Тарас", true, 15,h5,h6);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
        System.out.println(h9);








        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















