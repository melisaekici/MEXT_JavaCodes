package com.melisaekici;

import java.util.Scanner;

public class _30_SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        switch (dayNumber){                         // break; koyulmazsa sıradaki breake kadar yazmaya devam eder
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
        }
    }
}
