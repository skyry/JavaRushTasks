package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {

        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            a = (strings.get(i).length() > a) ? strings.get(i).length() : a;
        }

        for (String s : strings) {
            if (s.length() == a) System.out.println(s);
        }
    }
}

     /*   strings = new ArrayList<>();
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       int max=0;
       int j=1;
       String m = null;
       String m1 = null;

        for (int i=0; i<5; i++){
            strings.add(reader.readLine());//напишите тут ваш код
        }
        for (int i=0; i<5; i++) {
            if (strings.get(i).length() > max) {
                max=strings.get(i).length();
                m = strings.get(i);
            } if (strings.get(j).length() == max) {
                m1 = strings.get(j);
                j++;
            }
        }
          if (m.length()==m1.length()){
              System.out.println(m);
              System.out.println(m1);
          }
          else
            System.out.println(m);



    }
}
*/