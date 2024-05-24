package com.melisaekici;

import java.util.Scanner;

public class _6_Length {

    //String userName = "Melisa Ekici";
    //int userNameLength = userName.length();
    //System.out.println("Karakter Sayısı: " + userNameLength);


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //input string alma
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        String userName = scanner.nextLine();
        System.out.println("Karakter Sayısı: " +userName.length());
        int userNameLength = userName.length(); // sürekli length yazmamak için uzunluğu tanımlıyoruz
        if (userNameLength > 8) {
            System.out.println("Kullanıcı adı 8 karakterden büyük olamaz.");
        }else{
            System.out.println("Kullanıcı adı geçerli");
        }



    }
}
