package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date){

        SimpleDateFormat format = new SimpleDateFormat("MMM d yyyy");
        Date now = new Date(date);
        Date yearStart = new Date(now.getYear(),0,1);

        long time = now.getTime() - yearStart.getTime();
        long msDay = 24*60*60*1000;
        long dayCount = 1+time/msDay;

        System.out.println(format.format(now));
        //System.out.println(format.format(yearStart));

        if (dayCount%2!=0)
            return true;
        else return false;
    }
}
