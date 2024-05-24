package com.melisaekici;

public class _4_StaticVariables {

    public int count = 0; //instancevariable (global değişken)
    static int price = 300;

    public void displayAge(){
        int age = 30;
        System.out.println("Display Age " +age);
        this.count = this.count + 1;
        System.out.println("Count:  " + this.count);
        price = price + 30;
        System.out.println("Price:  " + price);
    }

    public static void main(String[] args) {
        System.out.println("Merhaba");
        _4_StaticVariables example = new _4_StaticVariables();
        example.displayAge();
        example.displayAge();
        example.displayAge();
    }
}
