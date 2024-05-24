package com.melisaekici;

public class _11_Trim_Replace {

    // baştaki ve sondaki boşlukları kaldırır
    // belirtilen karakterleri değiştirir

    public static void main(String[] args) {

        // trim
        String str = "    Java Öğreniyorum  ";
        System.out.println(str.length());
        String trimmedStr = str.trim();
        System.out.println(trimmedStr);
        System.out.println(trimmedStr.length());


        // replace
        String productCode = "PRD-2024-0004";
        String newProductCode = productCode.replace("-", " "); // karakterler tek '' tırnak ile yazılabilir
        System.out.println("Yeni ürün kodu: " + newProductCode);

        String newProductCode2 = newProductCode.replace(" ", "_");
        System.out.println("Yeni Ürün Kodu: " + newProductCode2);

        String newProductCode3 = newProductCode2.replace("_", "");
        System.out.println("Yeni Ürün Kodu: " + newProductCode3);

        String aboutUs = "Merhabalar, biz 01-03-2023 yılında kurulan bir start-up şirketiyiz. Yapay zeka......";
        String aboutUs2024 = aboutUs.replace("2023", "2024");
        System.out.println("Düzeltilmiş Metin: " + aboutUs2024);


    }
}
