package com.melisaekici;

import java.util.Scanner;

public class _7_SubString {

    public void checkCreditCard(String control){
        String visaControl = "1234";
        String masterControl = "4567";
        if (control.equals(visaControl)) { // equals == olarak kullanılıyor
            System.out.println("Kartınız visa");
        }else if(control.equals(masterControl)){
            System.out.println("Kartınız mastercard");

        }else{
            System.out.println("Kredi kartı numaranızı kontrol ediniz");
        }
    }

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

        System.out.println("Kredi Kartı Numaranızı Giriniz");
        String creditCardNumber = scanner.nextLine();
        String las4Digit = creditCardNumber.substring(12); // sadece 16 tane olan sayıların son 4 hanesini alabilir
        System.out.println("Son 4 Hane: " + las4Digit);


        // Length ile alternatif (sadece son 4 haneyi bulma)
        int creditCardDigits = creditCardNumber.length();
        System.out.println("Digit: " + creditCardDigits);
        int beginIndex = creditCardDigits - 4; // son 4 haneyi istiyoruz o yüzden
        System.out.println("Son 4 Hanesi: " + creditCardNumber.substring(beginIndex));


        // SubString (int begin, end)
        String first4Digit = creditCardNumber.substring(0,4);
        System.out.println("İlk 4 Hanesi: " + first4Digit);

        _7_SubString example = new _7_SubString(); // ilk 4 hanesini kontrol ederek visa mı master mı kontrol ediyor
        example.checkCreditCard(first4Digit); // public voidin içindeki değişkene erişmek


    }
}
