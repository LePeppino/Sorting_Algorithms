package com.company;
import java.io.*;

public class UtilityTool {

    public int[] toArray(File file, int elements) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            try {
                array[i] = reader.read();
            }
            catch(IOException e){
                e.printStackTrace();
                System.out.println("toArray hat sich zerschossen :(");
            }
        }
        return array;
    }

    public void checkIfSorted(int[] array){
        for(int i = 1; i < array.length; i++){
            if (array[i] < array[i-1]){
                System.out.println("Das Array ist nicht korrekt soritert");
                break;
            }
        }
    }
}
