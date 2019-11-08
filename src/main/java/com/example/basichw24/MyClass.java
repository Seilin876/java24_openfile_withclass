package com.example.basichw24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String[] args) {
        grade studentGrade = new grade();
        int i=0;
        try {
            File file = new File("C:\\Users\\USER\\AndroidStudioProjects\\MyApplication\\basicHW24\\couse.txt");//自己電腦的路徑
            File fileHW = new File("couse.txt");//繳交作業路徑

            FileInputStream readIn = new FileInputStream(file);
            //FileInputStream readIn = new FileInputStream(fileHW);
            InputStreamReader read = new InputStreamReader(readIn, "UTF-8" );
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
                studentGrade.getStudentData(i,oneLine);
                i++;
            }
            read.close();
        }
        catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
        studentGrade.PrintAllData();
    }
}