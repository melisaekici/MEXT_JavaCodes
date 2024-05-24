package com.melisaekici;

import java.util.Arrays;
import java.util.Scanner;

public class _23_Egzersiz {

    public static void main(String[] args) {

        //1

        Scanner scanner = new Scanner(System.in); // kişiden input stringi al
        System.out.println("Lütfen Adınızı Giriniz: ");
        String userName = scanner.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz: ");
        String userSurname = scanner.nextLine();

        System.out.println("Lütfen Yaşadığınız Şehri Giriniz: ");
        String userFrom = scanner.nextLine();
        System.out.println("Girilen Veriler: " + userName + " " + userSurname + " " + userFrom);

        // en son stringBuilder oluşturup onları içine ekle
        StringBuilder sbText = new StringBuilder(userName + " " + userSurname + " " + userFrom);
        System.out.println(sbText);

        System.out.println("**********************************************************");

        // 2
        // Kullanıcının girdiği kelimenin palindrom olup olmadığını kontrol eden
        System.out.println("Lütfen bir kelime giriniz: ");
        String userMessage = scanner.nextLine();
        StringBuilder userMessageSB = new StringBuilder(userMessage);
        System.out.println("Girdiniz kelime : " + userMessageSB);

        userMessageSB.reverse();
        String isItPolindrome = userMessageSB.toString();

        if (userMessage.equals(isItPolindrome)){
            System.out.println("Girdiniz kelime bir polindrom!");
        }else {
            System.out.println("Girdiğiniz kelime bir polindrom değil");
        }


        // 3
        // Girilen cümledeki bir kelimeyi başka bir kelime ile değiştirin

        String lineToChange = "Lütfen Adınızı Giriniz: ";
        System.out.println("Girilen cümle: " + lineToChange);

        String changedWord = lineToChange.replace("Adınızı", "Soyadınızı");
        System.out.println("Değiştirilmiş cümle " + changedWord);

        // 4
        // Kullanıcının birden fazla bilgi girmesini sağlayarak bir rapor oluşturun.
        // Örneğin, kullanıcının adı, soyadı, yaş ve şehir bilgilerini alarak bir rapor oluşturun.

        System.out.println("Lütfen Adınızı Giriniz: ");
        String userName2 = scanner.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz: ");
        String userSurname2 = scanner.nextLine();

        System.out.println("Lütfen Yaşadığınız Şehri Giriniz: ");
        String userFrom2 = scanner.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        String userAge2 = scanner.nextLine();

        //System.out.println("Girilen Veriler: " + userName2 + " " + userSurname2 + " " + userFrom2 + " " + userAge2);

        // en son stringBuilder oluşturup onları içine ekle
        String userInfo = "Kullanıcı Ad: " + userName2 + " Kullanıcı Soyad " + userSurname2 + " Kullanıcı İl " + userFrom2 + " Kullanıcı Yaş " + userAge2;
        String[] userInfoList = userInfo.split(" ") ;
        System.out.println(Arrays.toString(userInfoList));



    }
}
