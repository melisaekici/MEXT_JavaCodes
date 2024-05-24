package com.melisaekici;

import java.util.Scanner;

public class _17_Ahmet_Alıştırma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Adınızı Giriniz: ");
        //String isim = sc.nextLine();

        //String newName = isim.replace(" ", "-");
        //System.out.println(newName);

        for (; ; ) {
            System.out.println("Adınızı Giriniz: ");
            String name = sc.nextLine();
            String newName2 = name.replace(" ", "-");
            System.out.println(newName2);
            if (newName2.contains("ahmet")) {
                break;
            }

        }

    }
}