package org.example.Sorting;

public class HeapSort {

    public void heapify(int[] array, int n, int current) {
        int largest = current;
        int left = current * 2 + 1;
        int right = current * 2 + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != current) {
            int temp = array[current];
            array[current] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }

    public void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i > 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
}
