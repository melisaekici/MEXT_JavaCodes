package com.melisaekici;

import java.util.Random;
import java.util.Scanner;

public class _26_UserDependentPswGenerator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String upperText = "ABCDEFGHIİJKLMNOÖPRSŞTUÜVYZ";
        String lowerText = "abcdefghıijklmnoöprsştuüvyz";
        String numbers = "123456789";
        String symbols = "£#$½{[]}!'^+%&/()=?_-";
        String passwordRegex = upperText + lowerText + numbers + symbols;

        System.out.println("Lütfen Şifrenizin Uzunluğunu Belirleyiniz: ");
        int desiredLength = scanner.nextInt();
        System.out.println("İstenilen Uzunluk: " + desiredLength);

        StringBuilder password = new StringBuilder();

        for(int i = 0 ; i < desiredLength ; i++){
            int userIndex = random.nextInt(passwordRegex.length());
            char userChar = passwordRegex.charAt(userIndex);
            System.out.println(userChar);
            password.append(userChar);
        }
        System.out.println("Oluşturulan Şifre: " + password);
        }



    }

