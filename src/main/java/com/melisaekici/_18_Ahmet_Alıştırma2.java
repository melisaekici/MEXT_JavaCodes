package com.melisaekici;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _18_Ahmet_Alıştırma2 {

    // basamak sayısını döndüren kod

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.println("Bir Sayı Giriniz: ");
            String birSayı = sc.nextLine();
            int countDigits = birSayı.length();
            System.out.println(birSayı + " sayısının basamak sayısı: " + countDigits);

            if (birSayı.isEmpty()) {
                System.out.println("");
            //}else if(birSayı == 0){
                System.out.println("");
                return;

            }
        }

    }
}

