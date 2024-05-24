package com.melisaekici;

import java.util.Random;
import java.util.Scanner;

public class _24_Random {


    public static void main(String[] args) {

//        // rastgele sayı üretmek için
//        // Math sınıfı içerisinde ulaşılabilir bir metod
//        // double değer üretir
          // Burada yok ama nextFloat ve nextLong da var
//
//        Random random0 = new Random();               // önce tanımlanmalı
//
//
//        while(true){
//          int randomInteger = random0.nextInt();       // eksi de üretebilir
//          System.out.println(randomInteger);
//            break;
//        }
//
//        int loopNumber = 0;
//        while (loopNumber < 5){ // True T T T False
//            loopNumber++;       // 1 2 3 4 5
//            int randomInteger = random0.nextInt();       // eksi de üretebilir
//            System.out.println(randomInteger);
//        }


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        String userName;
//        boolean isThatCorrect = false;
//
//        while(!isThatCorrect){
//            userName =scanner.nextLine();
//            if (userName.length() > 8);
//                isThatCorrect = true;

//        while(true) {
//
//            Scanner newScanner = new Scanner(System.in);
//            Random random = new Random();
//            int randomNumber = random.nextInt(3) * 100;
//            System.out.println(randomNumber);
//        }

        // nextDouble 0 ile 1 arasında rastgele sayı üretir
//        while(true) {
//            Random random = new Random();
//            double randomDoube = random.nextDouble() * 10; // çeşitli sayılarla çarpıp 0-1'den çıkabiliriz
//            System.out.println(randomDoube);
//        }

        while(true) {
            Random random = new Random();
            boolean randomBoolean = random.nextBoolean();
            System.out.println(randomBoolean);
        }
        }


    }
//}
