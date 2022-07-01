package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] m=new int[15];
        int[] ch=new int[8];
        int[] nch=new int[7];
        int j=0;
        int x=0;
        int sumch = 0;
        int sumnch = 0;

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<m.length; i++){
            m[i]=Integer.parseInt(reader.readLine());}

            for (int i=0; i<m.length; i++){
            if (((i%2)==0)|(i==0)){
                ch[j]=m[i];
            j++;}
            else if ((i%2)!=0){
                nch[x] = m[i];
                x++;}
            }

            for (int i=0; i<ch.length; i++){
            sumch = sumch+ch[i];
            }

            for (int i=0; i<nch.length; i++){
            sumnch = sumnch + nch[i];
            }
            if (sumch>sumnch) {
                System.out.println("В домах с четными номерами проживает больше жителей.");
            }
            else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }



    }

