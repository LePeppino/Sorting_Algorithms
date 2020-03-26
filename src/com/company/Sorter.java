package com.company;

public class Sorter {
    //HELPERS
    protected static int left(int i){return 2 * i;}
    protected static int right(int i){return 2 * i + 1;}
    protected static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
