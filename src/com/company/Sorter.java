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

    //HEAP SORT
    public void heap(int[] array) {
        int n = array.length; //n = heapsize
        buildMaxHeap(array, n);
        for(int i = array.length; i == 2; i--){
            arrSwap(array, 1, i);
            n -= 1;
            heapify(array, 1, n);
        }
    }
    public void buildMaxHeap(int[] array, int n){
        for(int i = n / 2; i == 1; i--){ //n = heapsize
            heapify(array, i, n);
        }
    }
    public void heapify(int[] array, int i, int n){
        int left = left(i);
        int right = right(i);
        int largest;

        if(left <= n && array[left] > array[i]){ //n = heapsize
            largest = left;
        } else{
            largest = i;
        }

        if(right <= n && array[right] > array[largest]){
            largest = right;
        }

        if(largest != i){
            arrSwap(array, i, largest);
            heapify(array, largest, n);
        }
    }
    public int left(int i){
        return 2 * i;
    }
    public int right(int i){
        return 2 * i + 1;
    }
    public void arrSwap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    //MERGE SORT
    public void merge(int[] array){

    }

    //QUICKSORT
    public void quick(int[] arr, int p, int r)
    {
        if (p < r)
        {
            int s = partition(arr, p, r);
            quick(arr, p, s-1);
            quick(arr, s+1, r);
        }
    }
    public int partition(int[] array, int p, int r)
    {
        int pivot = array[r];
        int i = (p-1);
        for (int j = p; j < r; j++)
        {
            if (array[j] <= pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[r];
        array[r] = temp;

        return i+1;
    }

}
