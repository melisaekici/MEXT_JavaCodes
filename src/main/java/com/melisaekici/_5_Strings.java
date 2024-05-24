package com.melisaekici;

import java.util.Scanner;

public class _5_Strings {
    public void checkUserName(String secondChar){
        String name = "Melisa";
        char firstCharacter = secondChar.charAt(0);
        System.out.println("Girilen Değer: " +firstCharacter);

        char secondCharacter = name.charAt(1);
        if(firstCharacter == secondCharacter) {
            System.out.println("Doğru");
        }else{
            System.out.println("Yanlış");
        }

    }

    public static void main(String[] args) {
        String name= "Melisa Ekici";
        // ["i","r","e","m"]
        // [{ad: "irem", soyad:"arslan"}, {ad: "cansel"}] <- arkplanda dizi olarak tutulur.

        //_5_Strings example = new _5_Strings();
        //example.checkUserName('M');
        char secondChar = name.charAt(1);
        System.out.println("Second Char: " + secondChar);

        Scanner scanner = new Scanner(System.in); // kişiden input stringi al
        System.out.println("Kızlık soyadınızın ikinci harfi: ");
        String checkValue = scanner.nextLine();

        _5_Strings example = new _5_Strings();
        //example.checkUserName(secondChar);
        example.checkUserName(checkValue);


    }
}
