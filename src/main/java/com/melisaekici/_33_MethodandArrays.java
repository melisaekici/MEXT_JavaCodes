package com.melisaekici;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class _33_MethodandArrays {

    public static void main(String[] args) {

        int[] numbers = {1,100,5,80,10};
        String[] names = {"melisa" , "samed", "kerem", "ceylin", "zeynep"};
        Arrays.sort(numbers);
        Arrays.sort(names);
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        int indexOf20 = Arrays.binarySearch(numbers, 80);   // - döndüğünde yok demek
        System.out.println("index of 20 is " + indexOf20);

        int indexOfMelisa = Arrays.binarySearch(names, "melisa");   //binarySearch çalışması için önce sort edilmeli!!
        System.out.println("index of Melisa is " + indexOfMelisa);


    }
}
