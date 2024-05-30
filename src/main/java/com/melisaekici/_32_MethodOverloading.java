package com.melisaekici;

public class _32_MethodOverloading {

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

     public double addDouble(double a, double b){
        return a +b;
    }

    public double add(double a, double b, double c){
        return a+b+c;
    }

    public int addInt(int a, int b){
        return a+b;
    }

    //Method örnek
    public double multiplication(double a, double b){
            return a*b;
        }

    public double addMultiplication(double a, double b){
            return a*b;
        }

    public double addMultiplication(double a, double b, double c){
            return a*b*c;
        }

    public double multiplication(double a, double b, double c){
            return a*b*c;
        }

        // static eklersek
    public static int multiply(int a, int b){
        return a*b;
    }


    public static void main(String[] args) {
        _32_MethodOverloading project = new _32_MethodOverloading();
        int resultInt = project.add(10, 20);
        double resultDouble = project.addDouble(10.4, 20.7);
        System.out.println("resultDouble: " + resultDouble);

        // örnek çıktıları
        double resultMultpl = project.multiplication(10,20);
        double resultMultpl2 = project.addMultiplication(10,20.7);
        double resultMultpl3 = project.addMultiplication(10, 20, 30);
        System.out.println("resultMultpl: " + resultMultpl);

        // static çıktı
        int resultInt2 = multiply(10, 20);  //project.multiply yapmak zorunda kalmadık
        System.out.println("resultInt2: " + resultInt2);



    }




}
