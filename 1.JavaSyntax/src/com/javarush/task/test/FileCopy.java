package com.javarush.task.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("d:\\java\\test\\in.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\java\\test\\out.txt");

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
