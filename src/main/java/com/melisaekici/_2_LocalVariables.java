package com.melisaekici;

public class _2_LocalVariables {

    public void displayAge(){
        int age = 30;
        System.out.println("Display Age " +age); //Diğer mainlerde age2 erişilemez olacak çünkü local
    }

    public static void main(String[] args) {
        System.out.println("Merhaba");
        _2_LocalVariables example = new _2_LocalVariables();
        example.displayAge();
    }
}
