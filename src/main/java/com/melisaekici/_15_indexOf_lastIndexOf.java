package com.melisaekici;

public class _15_indexOf_lastIndexOf {

    public static void main(String[] args) {

        // Hamit
        String isim = "İzmir Bayraklı Osmangazi Mahallesi ";
        int indexOf = isim.indexOf("Bornova");  // yoksa -1 döner
        System.out.println(indexOf);

        if (indexOf ==-1) {
            System.out.println("Yoktur");
        }else{
            System.out.println("Vardır");
        }

        // İrem
        // örneğin i ilk nerede geçiyor

        String str = "Merhaba Java Dünyası ben geldim";
        int firstO = str.indexOf("Java"); //char'da tek tırnak stringde çift tırnak ister
        // olası hatalar için toUpperCase/toLowerCase kullanılabilir
        System.out.println("O'nun indexi: " + firstO); // yoksa -1 döner



        // dünyası kelimesinin geçtiği yeri bulsun ve önüne developer ekleyelim
        // merhaba java substring dünyası ben geldim
        // ilk stringi al + developer yaz + ikinci string

        // split ya da substring ile yapabiliriz
        // substring ile yapılması
        int indexOfWord = str.indexOf("Dünyası");
        System.out.println("Dünyası geçen yerin indexi: " + indexOfWord);
        String ilkString = str.substring(0,indexOfWord);
        String ikinciString = str.substring(indexOfWord);
        System.out.println(ilkString + " Developer " + ikinciString);
        // ya da
        String corrected = ilkString + "Developer" + ikinciString;
        System.out.println("Corrected" + corrected);

        // split ile yapılması
        String[] sentences = str.split("Dünyası"); // java arrayleri ekranda yazdırmaz javascript gösterir
        System.out.println("Sentences: " + sentences[0]);
        String correctedSentence = sentences[0] + " Developer " + sentences[2];


    }
}
