package com.company;

public class Sorter {

    //INSERTION SORT
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

    //HEAP SORT (recursive)
    public void heap(int[] array) {
        int n = array.length; //n = heapsize
        buildMaxHeap(array, n);
        for(int i = n - 1; i >= 0; i--){
            //swap root with end
            arrSwap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private void buildMaxHeap(int[] array, int n){
        for(int i = n / 2 - 1; i >= 0; i--){ //n = heapsize
            heapify(array, n, i);
        }
    }

    private void heapify(int[] array, int n, int i){
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
            arrSwap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    //HELPERS
    private int left(int i){
        return 2 * i;
    }
    private int right(int i){
        return 2 * i + 1;
    }
    private void arrSwap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    //MERGE SORT
    public void merge(int[] array){

    }

    //QUICKSORT
    public void quick(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot){i++;}
            while (arr[j] > pivot) {j--;}
            if (i <= j){
                arrSwap (arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j){quick(arr, low, j);}
        if (high > i){quick(arr, i, high);}
    }
}
