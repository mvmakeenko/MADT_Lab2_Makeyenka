package com.example.madt_lab2_makeyenka;

import java.util.StringTokenizer;

public class Counter {
    public static int count(String text, boolean choice) {
        int count;
        if (choice) count = text.length();
        else  {
            count = 0;
            char[] characters = (text+".").toCharArray();
            for (int i = 1; i < characters.length; i++)
            {
                if (Character.isLetter(characters[i-1]) && !Character.isLetter(characters[i]) ) {
                    count++;
                }
            }
        }
        //MainActivity.result.setText("Result: "+count);
        return count;
    }
}
