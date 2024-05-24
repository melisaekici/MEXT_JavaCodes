package com.melisaekici;

public class _14_starts_endsWith {

        // true false döner
        // bir ürün kodunun başlama yeri olabilir

    public static void main(String[] args) {

            // Hamit
        String isim = "Melisa Ekici";
        boolean starting = isim.startsWith("M");

        if (!starting);
            System.out.println("Hayır girilen harf ile başlamıyor.");


            // İrem

        String productCode = "IPHNX064X400";
        boolean isIPhone = productCode.startsWith("IPHN"); // ürün kodunun başında boşluk varsa çalışmaz
        boolean is64 = productCode.endsWith("064");
        System.out.println("IPhone mu? " + isIPhone);
        System.out.println("64 mü? " + is64);

    }
}
