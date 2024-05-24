package com.melisaekici;

public class _22_Insert_Delete_Replace_Reverse {


    public static void main(String[] args) {

        // İrem
        StringBuilder sbText = new StringBuilder("Samed");

        sbText.append(" Ekici").append(" İzmir");
        System.out.println("added text: " + sbText);

        char char2 = sbText.charAt(2);
        System.out.println("2.index " + char2);
        String sbTextString = sbText.toString(); // string türüne çevirdik

        sbText.insert(3, "Melisa");
        System.out.println(sbText);

        int wordIndex0 = sbText.indexOf("Melisa");
        System.out.println(wordIndex0);

        sbText.delete(wordIndex0,4 + wordIndex0);
        System.out.println(sbText);
        int wordIndex = sbText.indexOf("Melisa");
        System.out.println(wordIndex); // -1 döner çünkü manipülasyonlar sonucu Melisa diye kelime kalmadı

        sbText.replace(0, 10, "Java"); // 0 ve 10 arasını sildi Java ekledi (2 ayrı kod yazmaktan kurtulmuş olduk)
        System.out.println(sbText);


    }
}
