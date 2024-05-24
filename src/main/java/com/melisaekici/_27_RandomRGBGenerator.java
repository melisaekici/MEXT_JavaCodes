package com.melisaekici;

import java.util.Random;
import java.util.Scanner;

public class _27_RandomRGBGenerator {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        //System.out.println("Red: " + red + " Blue: " + blue + " Green: " +green);

        System.out.println("Kaç farklı renk istiyorsun? ");
        int colorCount = scanner.nextInt();
        StringBuilder rgbText = new StringBuilder(": ");
        System.out.println("RGBtext: " + rgbText);

        for (int i = 0; i < colorCount; i++) {
            int red = random.nextInt(255);
            int green = random.nextInt(255);
            int blue = random.nextInt(255);
            rgbText.append("rgb(").append(red).append(" , ").append(green).append(" , ").append(blue).append(") ");

        }
        System.out.println("rgbText" + rgbText);

    }
}

// ÖDEV İÇİN
// String regex = "Merhaba dünya yaz kış limon can sucuk"
// split kullanarak array çevir
// kelimeler arrayi olsun {"Merhaba", "dünya", "yaz", "kış", "limon".....}
// string değil array uzunluğunda
// kelimeler[0] kelimeler.length
// 3 kere 0dan lengthe kadar dönüp yeni atıcaz