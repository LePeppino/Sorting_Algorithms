package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException{

        long timeStart;
        long timeEnd;
        UtilityTool util = new UtilityTool();
        Scanner input = new Scanner(System.in);

	    System.out.println("Bitte den ABSOLUTEN Pfad der zu sortierenden Datei angeben. (Z.B. C:\\Users\\ericw\\IdeaProjects\\Sorting Algorithms\\res\\daten_100k)");


	    String path = input.nextLine();

	    File file = new File(path);

        Sorter sorter = new Sorter();

        int elements = util.getLengthOfFile(file);

        int[] array = util.toArray(file, elements);

	    System.out.println("\n Sortierverfahren auswaehlen: \n Insertion-Sort (1) \n Heap-Sort \t\t(2)\n Quick-Sort \t(3)\n Merge-Sort \t(4)");
	    int select = input.nextInt();
        switch(select){
            case 1:
                timeStart = System.currentTimeMillis();
                sorter.insertion(array);
                timeEnd = System.currentTimeMillis();
                System.out.println("Dauer des Insertion-Sort bei " + elements + " Elementen: " +  (timeEnd - timeStart) + "ms");
                break;
            case 2:
                timeStart = System.currentTimeMillis();
                sorter.heap(array);
                timeEnd = System.currentTimeMillis();
                System.out.println("Dauer des Insertion-Sort bei " + elements + " Elementen: " +  (timeEnd - timeStart) + "ms");
                break;
            case 3:
                timeStart = System.currentTimeMillis();
                sorter.quick(array, 0, array.length-1);
                timeEnd = System.currentTimeMillis();
                System.out.println("Dauer des Insertion-Sort bei " + elements + " Elementen: " +  (timeEnd - timeStart) + "ms");
            case 4:
                timeStart = System.currentTimeMillis();
                sorter.merge(array);
                timeEnd = System.currentTimeMillis();
                System.out.println("Dauer des Insertion-Sort bei " + elements + " Elementen: " +  (timeEnd - timeStart) + "ms");

        }

        util.checkIfSorted(array);

    }

}
