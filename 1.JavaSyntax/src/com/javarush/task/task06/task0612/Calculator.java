package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int s = a+b;//напишите тут ваш код
        return s;
    }

    public static int minus(int a, int b) {
        int m = a-b;//напишите тут ваш код
        return m;
    }

    public static int multiply(int a, int b) {
        int m1 =a*b;//напишите тут ваш код
        return m1;
    }

    public static double division(int a, int b) {
        return (double) a/b;//напишите тут ваш код
    }

    public static double percent(int a, int b) {
        double p = a*b/100;//напишите тут ваш код
        return p;
    }

    public static void main(String[] args) {

    }
}