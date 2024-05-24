package com.melisaekici;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _13_isEmpty {

    public static void main(String[] args) {

        // Hamit
        Scanner sc = new Scanner(System.in);
        System.out.println("Adınızı Giriniz: ");
        String isim = sc.nextLine();

        if (!isim.isEmpty()) {
            System.out.println("Boş değil " + isim);
        }else{
            System.out.println("Kullanıcı adı boş olamaz");
        }

        // İrem

        //Scanner

        System.out.println("Kullanıcı Adı: ");
        String userName = sc.nextLine();
        boolean isUserNanmeEmpty = userName.isEmpty();
        int userNameLength = userName.length();
        System.out.println("Girilen kullanıcı adı karakter sayısı : " + userNameLength);
        System.out.println("is empty? " + isUserNanmeEmpty);

    }
}


