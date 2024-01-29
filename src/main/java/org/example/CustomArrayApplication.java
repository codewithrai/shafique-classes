package org.example;

import java.util.ArrayList;

public class CustomArrayApplication {
    public static void main(String[] args) {

        CustomArray<String> customArray = new CustomArray<>();

        customArray.add("A"); // 0
        customArray.add("B"); // 1
        customArray.add("C"); // 2
        customArray.add("D"); // 3
        customArray.add("E"); // 4

        System.out.println("Before delete");
        System.out.println(customArray);

        // remove 2 -> C
        customArray.remove(2);
        System.out.println("After delete");
        System.out.println(customArray);

        /**
         * decrease the size
         * decrease the current index
         * shift all the elements to left side if exists
         */
        customArray.add("A"); // 0
        customArray.add("B"); // 1
        customArray.add("D"); // 2
        customArray.add("E"); // 3


//        System.out.println(customArray.get(0));
//        System.out.println("Capacity: " + customArray.getCapacity());
//        System.out.println("Size: " + customArray.getSize());
//        System.out.println("Current Index: " + customArray.getCurrentIndex());
    }
}