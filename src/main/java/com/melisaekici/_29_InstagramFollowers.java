package com.melisaekici;

import java.util.Scanner;

public class _29_InstagramFollowers {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] followers = {"Melisa Ekici", "İrem Arslan", "Samed Çiçek", "Ceylin Ekici", "Kerem Çamdereli"};
        String[] following = {"İrem Eledağ", "İrem Bodur", "İrem Eda", "Zeynep Akçor", "5"};

        int followersCount = followers.length;
        int followingCount = following.length;

        System.out.println("Takipçi Sayısı: " + followersCount);
        System.out.println("Takip Edilen Sayısı" + followingCount);

        System.out.println("Takipçi Listesi için 1'e, Takip Listesi için 2'ye Basınız.");
        int operation = sc.nextInt();

        System.out.println("Operasyon: " + operation);

        switch (operation){
            case 1:
                for (int i = 0; i < followersCount; i++) {
                    String name = followers[i];
                    System.out.println(name);
                }
                break;
            case 2:
                // yukarısının aynısı yapılabilirdi ama gelişmiş for deneyelim
                for(String name: following) {
                    System.out.println(name);
                    for (int i = 0; i < followersCount; i++) {
                        System.out.println("Döngü İçerisinde " + followers[i]);
                        String followersName = followers[i];
                        boolean isTheSame = followersName.equals(name);
                        if (isTheSame) {
                            System.out.println("Ortak " + followersName);
                        }
                    }
                }
                break;
            default:
                System.out.println("Geçersiz İşlem");
                break;
        }






    }

}
