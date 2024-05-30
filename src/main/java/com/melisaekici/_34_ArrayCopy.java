package com.melisaekici;

import java.util.Arrays;

public class _34_ArrayCopy {

    public static void main(String[] args) {

        String[] names = {"melisa" , "samed", "kerem", "ceylin", "zeynep"};

        String[] names2 = Arrays.copyOf(names, names.length+3);
        names2[5] = "irem";
        names2[6] = "boncuk";
        names2[7] = "koko";

//        String[] names3 = Arrays.copyOf(names, 10);
//        names[8] = "kübra";
//        names[9] = "samed";

        for (int i = 0; i < names2.length; i++) {
            System.out.println("Nesne: " + names2[i]);
        }

//        for (int i = 0; i < names3.length; i++) {
//            System.out.println("Nesne: " + names3[i]);
//        }


    }
}
