package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Sorter {

    public int getLengthOfFile(File file) throws FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int length = 0;
        try {
            while (reader.readLine() != null) {
                length++;
            }
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Da hats den Linezaehler zerschossen :(");
        }
        return length;

    }

    public void insertion(int[] array){

            int n = array.length;
            for (int i = 1; i < n; i++) {
                int key = array[i];
                int j = i - 1;

                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
            }

    }
    public void heap(int[] array) {

    }

    public void merge(int[] array){

    }

    public void quick(int[] array){

    }
}
