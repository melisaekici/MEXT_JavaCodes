package com.melisaekici;

import java.util.Random;

public class _25_RandomPasswordGenerator {


    public static void main(String[] args) {

//        Random random = new Random();
//        String text = "1234";
//         int index = random.nextInt(text.length());
//        System.out.println("Random Index: " + index);
//        char randomChar = text.charAt(index);
//        System.out.println("Random Character: " + randomChar);
//        StringBuilder password = new StringBuilder();
//
//
//        for (int i = 0; i < 4; i++) {
//            int generatedRandomNumber = random.nextInt(10); // 0-9 arasında sayı türetecek
//            System.out.println("Generated Random Number: " + generatedRandomNumber);
//            password.append(generatedRandomNumber);
//
//            System.out.println("Password: " + password.toString());

        Random random = new Random();
        String upperText = "ABCDEFGHIİJKLMNOÖPRSŞTUÜVYZ";
        String lowerText = "abcdefghıijklmnoöprsştuüvyz";
        String numbers = "123456789";
        String symbols = "£#$½{[]}!'^+%&/()=?_-";
        String passwordRegex = upperText + lowerText + numbers + symbols;
        System.out.println("PasswordRegex: " + passwordRegex);


        StringBuilder password = new StringBuilder();
//        password.append(passwordRegex.charAt(3) + passwordRegex.charAt(10) + passwordRegex.charAt(42) + passwordRegex.charAt(5));
//        System.out.println("password: " + password); // BURALARI İPTAL ETTİK

        for(int i = 0 ; i < 15 ; i++){
            int randomIndex = random.nextInt(passwordRegex.length()); //passwordRegex uzunluğu kadar boundlanmalı
            char randomChar = passwordRegex.charAt(randomIndex);
            System.out.println(randomChar);
            password.append(randomChar);
        }
        System.out.println("Oluşturulan Şifre: " + password);


    }
}


