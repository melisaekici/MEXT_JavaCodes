package com.melisaekici;

public class _12_Split {

    // belirtilen ifadeye göre girilen stringi (regex ile) ayrıştırır. Örneğin bir metni cümle cümle ayırmak istenirse kullanılabilir.

    public static void main(String[] args) {

        String toDoText = "Kitap al, müzik dinle, java öğren, uyu";
        String[] toDoList = toDoText.split(", "); // String[] liste/dizi döneceğini tanımlar. İstersek ", " şeklinde yazabiliriz ya da "," yapıp boşluğu trimleyebiliriz.
        // toDoList["Kitap al", "müzik dinle", "java öğren", "uyu"];

        System.out.println("ToDoList Uzunluğu: " + toDoList.length);
        System.out.println("ToDoList: " + toDoList[3]); // index vererek de elemanlarını gösterebiliriz
        System.out.println("ToDoList: " + toDoList[toDoList.length-1]); // eleman sayısını bilmeden sonuncu elemanı alabiliriz

        // for(String toDo : toDoList);
        // for döngüsü ile listenin içerisinde dönerek bütün elemanlar listelenebilir (liste uzunluğunu belirtmemize gerek olmadan)
        // i++ = i + 1
        for(int i = 0; i < toDoList.length; i++) { // sıfırdan listenin uzunluğuna kadar döndürür
            // 0 1 2 3 (4 4ten küçük değil sonlanır)
            // i = 0;
            // System.out.println("i: " + i); Konsolda i görünmesin
            // i = i+1; -1
            // tekrar döndüğünde i = i+1; -1 + 1 = 2
            // System.out.println("ToDoList: " + toDoList[i]);
            String y = toDoList[i].trim();
            /*
            String x = toDoList[i].trim()
                    .replaceAll(" ", "")  // aşağıda geçip noktaları koyunca birden çok işlem yapabiliriz
                    .toLowerCase()
                    .toUpperCase();                                // vsvssvsvs
            System.out.println("ToDoList: " + x);
             */

            // System.out.println(i+1 + ": " + y); // YA DA DEĞİŞKEN OLARAK ATA

            int counter = i+1;
            System.out.println(counter + ": " + y);

            for(String list: toDoList){                 // üstte i iile yapılan işlemin aynısını daha kolay (arkaplanda) bir şekilde yapıyor
                //System.out.println("List: " + list);
            }
        }


        String aSentence = "Merhabalar, ";


    }
}
