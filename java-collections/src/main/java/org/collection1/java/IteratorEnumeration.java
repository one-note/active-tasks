package org.collection1.java;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class IteratorEnumeration {


        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Java");
            arrayList.add("Rust");
            arrayList.add("C++");

            System.out.println("Using Iterator with ArrayList:");
            for (String lang : arrayList) {
                System.out.println(lang);
            }

            Vector<String> vector = new Vector<>();
            vector.add("JavaScript");
            vector.add("Ruby");
            vector.add("Solidity");

            System.out.println("Using Enumeration with Vector:");
            Enumeration<String> enumeration = vector.elements();
            while (enumeration.hasMoreElements()) {
                String language = enumeration.nextElement();
                System.out.println(language);
            }
        }
    }



