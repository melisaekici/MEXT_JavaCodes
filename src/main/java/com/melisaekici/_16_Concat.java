package com.melisaekici;

import java.util.Scanner;

public class _16_Concat {

    // sonuna ekleme

    public static void main(String[] args) {

        // Hamit

        String izmir = "İzmir incisidir";
        String cennetIzmir = izmir.concat(" Egenin");
        System.out.println(cennetIzmir);

        String upperCase = "Melisa";
        String lowerCase = "melisa";
        if (!upperCase.equals(lowerCase)) {
            System.out.println("Hayır " + upperCase + " ile " + lowerCase + " eşit değildir");
        }

        System.out.println("******************************************************");

        if (upperCase.equalsIgnoreCase(lowerCase)) {
            System.out.println("Evet " + upperCase + " ile " + lowerCase + " aynıdır");
        }

        int a=4;
        String str1 = Integer.toString(a);
        int b=5;
        String str2 =String.valueOf(b);
        if (str1.equals(str2)) {
            System.out.println("4 == " + a);
        }else{
            System.out.println("4 != " + b);
        }

        // İrem
        Scanner sc = new Scanner(System.in);
        System.out.println("Adınız? ");
        String name = sc.nextLine();
        String  surname = sc.nextLine();

        String welcomeMessage = "Hoşgeldiniz,";
        String welcomeMessageWithFullName = welcomeMessage.concat(" ")
                                                            .concat(name)
                                                            .concat(" ")
                                                            .concat(surname);
        System.out.println(welcomeMessageWithFullName);




    }
}
