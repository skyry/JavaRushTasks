package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> child =new ArrayList<>();
        ArrayList<Human> child1=new ArrayList<>();
        ArrayList<Human> child2=new ArrayList<>();

        Human grandFather = new Human("Boris",true,69,child1);
        Human grandFather1 = new Human ("Ivan",true,89,child2);
        Human grandMother = new Human("Luba",false,69,child1);
        Human grandMother1 = new Human("Lara",false,65,child2);
        Human father =new Human("Tolya",true,55,child);
        Human mother =new Human("Natali",false,50,child);
        Human baby = new Human("Viktor",true,15);
        Human baby1=new Human("Ivan",true,25);
        Human baby2=new Human("Ulya",false,21);

        child.add(baby);
        child.add(baby1);
        child.add(baby2);

        child1.add(father);
        child2.add(mother);

        System.out.println(grandFather);
        System.out.println(grandFather1);
        System.out.println(grandMother);
        System.out.println(grandMother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(baby);
        System.out.println(baby1);
        System.out.println(baby2);
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human (String name, boolean sex, int age,ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }


        Human(String name, boolean sex, int age ){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
