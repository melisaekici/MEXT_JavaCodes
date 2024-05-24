package com.melisaekici;

public class _9_toUpperCase {

    // kullanılan dil büyük küçük harf duyarlıysa kullanıcıların ve satıcıların
    // girdiği isimleri arama yaparken büyük harfe (ya da küçük harfe) çevirir

    public static void main(String[] args) {
        String productName = "Bilgisayar L-123 15inch";
        System.out.println("Ürünler: " + productName.toUpperCase());
        System.out.println("Ürünler (küçük): " + productName.toLowerCase());
    }
}
