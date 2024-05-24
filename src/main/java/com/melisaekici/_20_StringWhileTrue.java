package com.melisaekici;

import java.util.Scanner;

public interface _20_StringWhileTrue {

        // for döngüsünde iterasyon kullanıyoruz
        // while döngüsünde de iterasyon yapılabilir
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userName;

        int x = 0;
        while(true){ // sonsuz döngü
                System.out.println("Kullanıcı Adı Giriniz: ");
                userName = sc.nextLine();
            System.out.println("Merhaba");
            //x++;
            //if(x >= 3){
            if(userName.length() > 8){
                System.out.println("Hoşgeldin ");
            }else{
                System.out.println("Kullanıcı adı 8 karakterden küçük olamaz");
                break;
            }

        }

    }
}
