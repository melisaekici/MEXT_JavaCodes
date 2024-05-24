package com.melisaekici;

import java.util.Random;
import java.util.Scanner;

public class _24_Egzersiz2 {

    // random integer kullanarak 1-100 arasında (+1) bir sayı sistem atasın
    // kullanıcıdan bir değer alsın (1 ile 100 arasındaki sayıyı tahmin et)
    // girilen değeri türettiği random ile karşılaştırsın
    // doğruysa bravo yanlışsa yanlış girsin
    // if ile true false


    // Ödev kullanıcı doğru bilene kadar devam edecek ve yukarı aşağı gibi kopyalar verecek
    // girilen sayı benim sayımdan büyükse yukarı yaz değilse aşağı yaz ve bunu bulana kadar devam ettir
    // bravo bildiniz yaz

    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomInteger = randomNumberGenerator.nextInt(100) + 1;
        System.out.println("Üretilen Sayı: " + randomInteger);


        while (true) {
            String userMessageToAsk = "Lütfen rastgele bir sayı giriniz:";
            System.out.println(userMessageToAsk);
            int userMessage = scanner.nextInt();
            System.out.println("Girdiniz Değer " + userMessage);

            if (randomInteger > userMessage) {
                System.out.println("Yukarı");
                //System.out.println("Lütfen tekrar deneyiniz");
                //int guessAgain = scanner.nextInt();

            } else if (randomInteger < userMessage) {
                System.out.println("Aşağı");
                //System.out.println("Lütfen tekrar deneyiniz");
                //int guessAgain2 = scanner.nextInt();

            } else {
                System.out.println("Bravo");
                break;
            }
        }


        // 2


    }

}
