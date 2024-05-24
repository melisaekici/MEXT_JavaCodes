package com.melisaekici;

public class _3_InstanceVariables {

    public int count = 0; //instancevariable (global değişken)

    public void displayAge(){
        int age = 30;
        System.out.println("Display Age " +age);
        this.count = this.count + 1;
        System.out.println("Count:  " + this.count);
    }

    public static void main(String[] args) {
        System.out.println("Merhaba");
        _3_InstanceVariables example = new _3_InstanceVariables();
        example.displayAge();
        example.displayAge();
    }



}
