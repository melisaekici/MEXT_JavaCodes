package com.melisaekici;

public class _22_EşitEşitOperatörü {


    // == eşit mi? (aynı tür, aynı içerik kontrol eder)
    // equals yalnızca içerik olarak aynı olup olmadığını kontrol eder (türüne bakmadan yazdırır)

    public static void main(String[] args) {
        String str1 = "Melisa";
        String str2 = "Melisa";
        StringBuilder str3 = new StringBuilder("Melisa"); // if döngüsünün içine yazınca yazdırmıyor bile çünkü türleri aynı olmadığı fazla belli
        String str5 = "melisa";


        if(str1==str2){
            System.out.println("Adaşsınız");
        }
        if(str2.equalsIgnoreCase(str5)){        // büyük küçük harf bakmadan kontrol ediyor
            System.out.println("Adaşsınız");
        }

    }
}
