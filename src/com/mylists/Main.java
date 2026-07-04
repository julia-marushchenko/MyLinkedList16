/**
 *  Java program to remove element by index in LinkedList.
 */
package com.mylists;

import java.util.LinkedList;
import java.util.List;

/**
 *  Mainclass.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating LinedList instance.
        List<String> myList = new LinkedList<>();

        // Adding elements to myList.
        myList.add("Neckar");
        myList.add("Elbe");
        myList.add("Rein");
        myList.add("Amazon");
        myList.add("Mississippi");
        myList.add("Nile");

        // Printing myList to console.
        System.out.println(myList); // Output: [Neckar, Elbe, Rein, Amazon, Mississippi, Nile]

        // Removing elements by indexes.
        myList.remove(1);

        // Printing myList after removing element with index 1 to console.
        System.out.println(myList); // Output: [Neckar, Rein, Amazon, Mississippi, Nile]

        myList.remove(2);

        // Printing myList after removing element with index 2 to console.
        System.out.println(myList); // Output: [Neckar, Rein, Mississippi, Nile]

     }
}