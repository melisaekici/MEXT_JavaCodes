package com.melisaekici;

import java.util.Scanner;

public class _29_Ternary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 30;
        String text = "Melisa";
        String userName = scanner.nextLine();
        String message = (age < 30) ? "Uygun" : "Uygun Değil";
        boolean isThatMatch = (text.length() > 8) ? true : false;
        boolean isUserAuth = (userName == "Admin") ? true : false;
        boolean isThatCorrect = false;
        int x = 10 + 40 / 100;
    }
}
