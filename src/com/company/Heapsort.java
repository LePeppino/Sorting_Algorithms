package com.company;

public class Heapsort extends Sorter{
    public static void sort(int[] array) {
        int n = array.length; //n = heapsize
        buildMaxHeap(array, n);
        for(int i = n - 1; i >= 0; i--){
            //swap root with end
            swap(array, 0, i);
            heapify(array, i, 0);
        }

    }

    private static void buildMaxHeap(int[] array, int n){
        for(int i = n / 2 - 1; i >= 0; i--){ //n = heapsize
            heapify(array, n, i);
        }
    }

    private static void heapify(int[] array, int n, int i){
        int left = left(i);
        int right = right(i);
        int largest = i; //largest = root

        if(left < n && array[left] > array[largest]){ //n = heapsize
            largest = left;
        } //else immer noch largest = i
        if(right < n && array[right] > array[largest]){
            largest = right;
        }
        if(largest != i){
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }
}
