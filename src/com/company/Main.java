package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        
	    System.out.println("Bitte den ABSOLUTEN Pfad der zu sortierenden Datei angeben. (Z.B. C:\\Users\\ericw\\IdeaProjects\\Sorting Algorithms\\res\\daten_100k)");

        Scanner s = new Scanner(System.in);
	    String path = s.nextLine();

	    File file = new File(path);

        Sorter sorter = new Sorter();

        int elements = sorter.getLengthOfFile(file);

        int[] array = new int[elements];

	    System.out.println("\n Sortierverfahren auswaehlen: \n Insertion-Sort (1) \n Heap-Sort (2)\n Quick-Sort (3)\n Merge-Sort (4)");
	    int select = s.nextInt();
        switch(select){
            case 1:
                sorter.insertion(array);
                break;
            case 2:
                sorter.heap(array);
                break;
            case 3:
                sorter.quick(array);

        }

    }

}
