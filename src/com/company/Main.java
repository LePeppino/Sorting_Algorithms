package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

public static void main(String[] args) throws FileNotFoundException {

    long timeStart;
    long timeEnd;
    UtilityTool util = new UtilityTool();
    Scanner input = new Scanner(System.in);

    System.out.println("State ABSOLUTE path to file " +
            "(e.g.: C:\\Users\\ericw\\IdeaProjects\\Sorting Algorithms\\res\\daten_100k)");

    String path = input.nextLine();
    File file = new File(path);
    Sorter sorter = new Sorter();
    int elements = util.getLengthOfFile(file);
    int[] array = util.toArray(file, elements);

    System.out.println("\n Choose sorting algorithm: \n Insertionsort \t(1) \n Heapsort \t\t(2)\n Quicksort \t\t(3)\n Mergesort \t\t(4)");
        int select = input.nextInt();
        switch (select) {
            case 1:
                timeStart = System.currentTimeMillis();
                sorter.insertion(array);
                timeEnd = System.currentTimeMillis();
                System.out.println("Time to sort array of " + elements + " Elements using Insertionsort: " + (timeEnd - timeStart) + "ms");
                break;
            case 2:
                timeStart = System.currentTimeMillis();
                sorter.heap(array);
                timeEnd = System.currentTimeMillis();
                System.out.println("Time to sort array of " + elements + " Elements using Heapsort: " + (timeEnd - timeStart) + "ms");
                break;
            case 3:
                timeStart = System.currentTimeMillis();
                sorter.quick(array, 0, array.length-1);
                timeEnd = System.currentTimeMillis();
                System.out.println("Time to sort array of " + elements + " Elements using Quicksort: " + (timeEnd - timeStart) + "ms");
                break;
            case 4:
                timeStart = System.currentTimeMillis();
                sorter.merge(array);
                timeEnd = System.currentTimeMillis();
                System.out.println("Time to sort array of " + elements + " Elements using Mergesort: " + (timeEnd - timeStart) + "ms");
        }
    util.checkIfSorted(array);

    }

}

