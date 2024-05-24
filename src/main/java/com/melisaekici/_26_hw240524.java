package com.melisaekici;

import java.util.Scanner;

public class _26_hw240524 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz (m): ");
        double userHeight = scanner.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz (kg): ");
        double userWeight = scanner.nextDouble();


        double BMI = userWeight / (userHeight * userHeight);
        System.out.println("Vücut Kitle İndexiniz: " + BMI);

        if (BMI < 18) {
            System.out.println("Zayıf");
        } else if (BMI < 24) {
            System.out.println("Normal");
        } else if (BMI < 29) {
            System.out.println("Fazla Kilolu");
        } else {
            System.out.println("Obez");
        }


        scanner.close();

    }
}

/* NASIL CM GİRİLİRSE HATA ALMAYACAĞINI BULçıkıyoz
 if(userHeight > 20) {
            double userHeightToKg = userHeight * 100;
            double BMICm = userWeight / (userHeightToKg * userHeightToKg);
        }else if(userHeight < 10){
            double BMIMeter = userWeight / (userHeight * userHeight);
        }
 */