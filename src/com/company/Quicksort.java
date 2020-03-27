package com.company;

public class Quicksort extends Sorter{
    public static void sort(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot){i++;}
            while (arr[j] > pivot) {j--;}
            if (i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j){sort(arr, low, j);}
        if (high > i){sort(arr, i, high);}
    }
}
