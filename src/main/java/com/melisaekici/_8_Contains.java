package com.melisaekici;

import java.util.Scanner;

public class _8_Contains {

    /*
    String str1 = "Java Öğreniyorum";
    boolean isThatMatch = str1.contains("A");
    System.out.println("A içeriyor mu? " yetişemedimmm);
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adress = scanner.nextLine();
        boolean isThatTurkish = adress.contains("ö");
        if (isThatTurkish) {
            System.out.println("Adres Türkçe karakter içeremez");
        }else{
            System.out.println("Adres doğru");
        }

        String password = scanner.nextLine();
        System.out.println("Şifreyi tekrar giriniz");
        String confirmPassword = scanner.nextLine();
        if (password.equals(confirmPassword)) {
            System.out.println("Giriş başarılı");
        }else{
            System.out.println("Şifreler uyuşmuyor tekrar giriniz");
        }
    }
}

