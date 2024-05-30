package com.melisaekici;

import java.util.Scanner;

public class _31_Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Girilen Değer: " + number1);
        String operation = scanner.nextLine();
        System.out.println("Operasyon" + operation);
        int number2 = scanner.nextInt();
        System.out.println("Girilen Değer: " + number2);

        int result = 0;
        switch (operation){
            case"+":
                result = number1 + number2;
                System.out.println(result);
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }

    }
}
