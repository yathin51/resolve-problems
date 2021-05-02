package org.example.coalition;

import java.sql.Date;
import java.util.Objects;

public class TestIncrement {


    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
       System.out.println("Line break");
        for (int i = 0; i < 6; ++i) {
            System.out.println(i);
        }

        TestIncrement testIncrement = new TestIncrement();

        if(Objects.nonNull(testIncrement)){
            System.out.println(" the Missing details : "+testIncrement);
        }

        boolean heatWave = false;
        System.out.print("heatwave : "+ testIncrement.heatWave);

//        Date rob = new Date(2021,12,12);
        java.util.Date sharon = new java.util.Date();
    }

    private static boolean heatWave = true;

}