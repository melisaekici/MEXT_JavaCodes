package com.melisaekici;

import java.util.Scanner;

public class _10_hw {
    // ! = değilse anlamını taşır önüne geldiği koşulun yanlış olduğu durumları ifade eder (false iken)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // kişiden input stringi al
        System.out.println("Kullanıcı Adınızı Giriniz: ");
        String userName = scanner.nextLine();

        int userNameLength = userName.length(); // sürekli length yazmamak için uzunluğu tanımlıyoruz
        boolean isThatTurkish = userName.contains("ğ");
        boolean firstChar = userName.startsWith("1");
        int last4char = userNameLength - 3;

        if (userNameLength < 8) {
            System.out.println("Kullanıcı adı 8 karakterden az olamaz.");
        } else if (isThatTurkish) {
            System.out.println("Kullanıcı adı Türkçe karakter içeremez");
        } else if (firstChar) {
            System.out.println("Kullanıcı adı geçersiz");
        } else {
            System.out.println("Kullanıcı adının son 3 hanesi: " + userName.substring(last4char));
            System.out.println("E-mail Giriniz: ");
        }

        String userEmail = scanner.nextLine();
        boolean isEmailValid = userEmail.contains("@");

        if (isEmailValid) {
            System.out.println("Şifrenizi Giriniz: ");
        } else {
            System.out.println("Geçersiz E-mail"); // else yazmakla uğraşmamak için if(!isEmailValid) yazıp bırakabilirdik.
        }


        String passwordControl = "1234";
        String password = scanner.nextLine();

        if (password.equals(passwordControl)) {
            System.out.println("Giriş başarılı");
            System.out.println("Hoşgeldin! " + userName);
        } else {
            System.out.println("Şifre Yanlış");

        }
    }
}
