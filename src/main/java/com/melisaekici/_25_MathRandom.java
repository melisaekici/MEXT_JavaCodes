package com.melisaekici;

public class _25_MathRandom {

    // 0-1 arasında double bir değer girer normal random gibi çarpımlar eklemeler yapıp manipüle edilebilir ancak esnekliği biraz daha az

    public static void main(String[] args) {

        double randomMathDouble = Math.random();
        System.out.println(randomMathDouble * 10);

        int randomDoubleToInt = (int) (randomMathDouble * 100);     // integera çevrilmesi başına (int) yazarak yapılır
        System.out.println(randomDoubleToInt);


    }
}
