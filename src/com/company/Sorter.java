package com.company;

import java.util.Arrays;

public class Sorter {

    //INSERTION SORT
    public void insertionsort(int[] array){
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
    public void heapsort(int[] array) {
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
    private static int left(int i){
        return 2 * i;
    }
    private static int right(int i){
        return 2 * i + 1;
    }
    private static void arrSwap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    //MERGE SORT
    public void mergesort(int[] array, int start, int end) {
        int middle = (start + end) / 2;
        int lengthLeft = end - start;
        if (lengthLeft <= 1) {
            return;
        }
        mergesort(array, start, middle);
        mergesort(array, middle, end);
        merge(array, start, middle, end);
    }
    private static void merge(int[] array, int start, int mid, int end) {
        int[] leftSubArray = Arrays.copyOfRange(array, start, mid);
        int[] rightSubArray = Arrays.copyOfRange(array, mid, end);
        int indexLeft = 0, indexRight = 0;
        for(int i = start; i < end; i++) {
            boolean more_left = indexLeft < leftSubArray.length;
            boolean more_right = indexRight < rightSubArray.length;
            boolean left_smaller = more_left && more_right
                    && leftSubArray[indexLeft] <= rightSubArray[indexRight];
            if (!more_right || left_smaller) {
                array[i] = leftSubArray[indexLeft];
                indexLeft++;
            } else {
                array[i] = rightSubArray[indexRight];
                indexRight++;
            }
        }
    }

    //QUICKSORT
    public void quicksort(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot){i++;}
            while (arr[j] > pivot) {j--;}
            if (i <= j){
                arrSwap (arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j){quicksort(arr, low, j);}
        if (high > i){quicksort(arr, i, high);}
    }
}
