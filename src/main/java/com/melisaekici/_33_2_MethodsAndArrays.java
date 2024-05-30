package com.melisaekici;

import java.util.Arrays;

public class _33_2_MethodsAndArrays {

    public static void main(String[] args) {
        String[] products = {"Telefon" , "Tablet", "Bilgisayar", "Elbise" , "Eldiven", "Araba"};
        Arrays.sort(products);
        System.out.println("Ürünler: " + products[0]); // Araba verir çünkü sortladık

        int index = Arrays.binarySearch(products, "Araba"); // binarySearch yapabilmek için sortlanmalı
        System.out.println("Araba var mı? \n" + index);

        String[] newProducts = Arrays.copyOf(products, 20);
        for (int i = 0; i < newProducts.length; i++) {
            System.out.println(newProducts[i]);
        }


    }
}
