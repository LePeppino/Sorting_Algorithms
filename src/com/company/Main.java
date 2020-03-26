/*
 * Authors: Eric Walter, Giuseppe Buccellato, Niklas Kirschnowski
 * Algorithmen und Datenstrukturen, Prof. Karsten Morisse
 * Sommersemester 2020
*/
package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
private static long timerStart;
private static long timerEnd;

    public static void main(String[] args) throws FileNotFoundException {
    UtilityTool util = new UtilityTool();
    Scanner input = new Scanner(System.in);

    System.out.println("State ABSOLUTE path to file (e.g.: C:\\Users\\ericw\\IdeaProjects\\Sorting Algorithms\\res\\daten_100k)");

    String path = input.nextLine();
    File file = new File(path);
    int elements = util.getLengthOfFile(file);
    int[] array = util.toArray(file, elements);

    System.out.println("\n Choose sorting algorithm: \n Insertionsort \t(1) \n Heapsort \t\t(2)\n Quicksort \t\t(3)\n Mergesort \t\t(4)");
    int select = input.nextInt();
    String name = "";
        switch (select) {
            case 1:
                timerStart = System.currentTimeMillis();
                Insertionsort.sort(array);
                timerEnd = System.currentTimeMillis();
                name = "Insertionsort";
                break;
            case 2:
                timerStart = System.currentTimeMillis();
                Heapsort.sort(array);
                timerEnd = System.currentTimeMillis();
                name = "Heapsort";
                break;
            case 3:
                timerStart = System.currentTimeMillis();
                Quicksort.sort(array, 0, array.length-1);
                timerEnd = System.currentTimeMillis();
                name = "Quicksort";
                break;
            case 4:
                timerStart = System.currentTimeMillis();
                Mergesort.sort(array, 0, array.length-1);
                timerEnd = System.currentTimeMillis();
                name = "Mergesort";
        }
    util.checkIfSorted(array);
    System.out.println("Time to sort an array of " + elements + " Elements using " + name + ": " + (timerEnd - timerStart) + "ms");

    }

}

