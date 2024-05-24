package com.melisaekici;

import java.util.Scanner;

public class _21_StringBuilder {

    // stringleri (immutable), mutable hale getiriyor
    // string manipülasyonu için kullanılır
    // == kullanımında string ve stringbuilder false verir toString kullanılarak stringe çevrilebilir

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adınız? ");
        //String name = sc.nextLine();
        System.out.println("Soyadınız? ");
        //String  surname = sc.nextLine();

        StringBuilder welcomeMessage = new StringBuilder("Hoşgeldin!");
        //welcomeMessage.append(" ").append(name).append(" ").append(surname);
        //System.out.println(" Welcome " + welcomeMessage);


        // İrem
        // string ile yapım
        String text = "Melisa";
        System.out.println("1-string: " + text);
        //System.out.println("string builder: " + sbText);

        String addedText = text.concat(" ").concat("Ekici");
        System.out.println("added text " + addedText);

        addedText.concat("İzmir");
        System.out.println(addedText);

        // string builder ile yapımı
        StringBuilder sbText = new StringBuilder("Melisa");

        sbText.append(" Ekici").append(" İzmir");
        System.out.println("added text: " + sbText);

        char char2 = sbText.charAt(2);
        System.out.println("2.index " + char2);
        String sbTextString = sbText.toString(); // string türüne çevirdik

    }
}
