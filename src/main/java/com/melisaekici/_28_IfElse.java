package com.melisaekici;

import java.util.Scanner;

public class _28_IfElse {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 30) {                 // ilk bulduğu doğruda bırakır
            System.out.println("Genç");
        }else if(age < 40) {
            System.out.println("Daha genç");
        }else if(age < 50){
            System.out.println("Çok daha genç");
        }else{

        }

    }
}
