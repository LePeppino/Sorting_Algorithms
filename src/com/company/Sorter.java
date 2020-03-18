package com.company;

public class Sorter {

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
