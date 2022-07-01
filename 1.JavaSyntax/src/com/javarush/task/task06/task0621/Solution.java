package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat grandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat grandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName,null,grandfather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName,grandmother,null);

        String brotherName = reader.readLine();
        Cat brother = new Cat(brotherName,mother,father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName,mother,father);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(brother);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name,Cat parent1){
            this.name = name;
            this.parent1 = parent1;
        }

        Cat(String name, Cat parent1, Cat parent2){
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "Cat name is " + name + ", no mother, " + "no father";
            else if (parent1 == null)
                return "Cat name is " + name + ", no mother, " + "father is " + parent2.name;
            else if (parent2 == null)
                return "Cat name is " + name + ", mother is " + parent1.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
        }
    }

}
