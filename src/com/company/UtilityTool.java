package com.company;
import java.io.*;

public class UtilityTool {

    public int getLengthOfFile(File file) throws FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int length = 1;
        try {
            while (reader.readLine() != null) {
                length++;
            }
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Line counter encountered a problem :'(");
        }
        return length;

    }

    public int[] toArray(File file, int elements) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            try {
                array[i] = reader.read();
            }
            catch(IOException e){
                e.printStackTrace();
                System.out.println("toArray encountered a problem :'(");
            }
        }
        return array;
    }

    public void checkIfSorted(int[] array){
        for(int i = 1; i < array.length; i++){
            if (array[i-1] > array[i]){
                System.out.println("The array is NOT sorted correctly from lowest to highest.");
                break;
            }
        }
    }
}
