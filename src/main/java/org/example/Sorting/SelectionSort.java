package org.example.Sorting;

public class SelectionSort {

    public void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            if (i != smallestIndex) {
                int temp = array[i];
                array[i] = array[smallestIndex];
                array[smallestIndex] = temp;
            }
        }
    }
}
