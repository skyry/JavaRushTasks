package com.javarush.task.task09.task0923;



import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String line = read.readLine();
        String G ="";
        String S="";

        for (int i=0; i<line.length(); i++) {
            if (isVowel(line.charAt(i))){
                G+=line.charAt(i)+" ";
            }
            else { if ((isVowel(line.charAt(i))==false) && line.charAt(i)!=' ')
                S+=line.charAt(i)+" ";
            }
        }
        System.out.println(G);
        System.out.println(S);

        //System.out.println(list);
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}