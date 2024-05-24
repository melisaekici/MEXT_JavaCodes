package com.melisaekici;

public class _1_ {
    public void displayAge(){
        int age2 = 30;
        System.out.println("Display Age " +age2); //Diğer mainlerde age2 erişilemez olacak çünkü local
    }



    public static void main(String[] args) {
    int age = 20; // değişken türü + değişkenin ismi = atama;
    boolean isThatMatch = true;
    String name = "Melisa";

    System.out.println("Yaş: " +age);
    System.out.println("Doğru mu? " +isThatMatch);
    System.out.println("İsim: " +name);


    }



}