package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (Character c : alphabet) {
            int count=0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    if (list.get(i).charAt(j)== c) {
                        count++;
                    }

                }

                //System.out.println(c + " " + count);


            }

            System.out.println(c + " " + count);

        }


    }
    /*HashMap<Character,Integer> rez = new HashMap<>();
        for (Character a:alphabet) {
            rez.put(a,0);
        }

        /for (Map.Entry<Character,Integer> x:rez.entrySet()){
           for(int i=0; i<list.size(); i++){
            for (int j=0;j<list.get(i).length(); j++){
             Character z = list.get(i).charAt(j);
             if (rez.containsKey(list.get(i).charAt(j))){
                 rez.put(x,+1);
             }

            }
           }
        }


        for (int i=0; i<33; i++){
        System.out.println(abcArray[i]+" "+ rez(abcArray[i]));}



    /*public static int rez(char x, ArrayList<String> list){
        int count = 0;
        for (int i=0; i<list.size(); i++){
            for (int j=0; j<list.get(i).length();j++){
                if(j==x){
                    count++;
                }
            }
        }
    */


}
