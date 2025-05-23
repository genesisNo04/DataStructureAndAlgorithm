package org.example.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {10, 16, 8, 12, 15, 6, 3, 9, 5};
        System.out.println("Before sort: " + Arrays.toString(array));
        quicksort(array, 0, array.length - 1);
        System.out.println("After sort: " + Arrays.toString(array));
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int pivotIndex = left;

        while (left < right) {
            while (left < array.length && array[left] <= pivot) {
                left++;
            }

            while (right >= 0 && array[right] > pivot) {
                right--;
            }

            if (left > right) {
                break;
            }

            swap(array, left, right);
        }

        swap(array, pivotIndex, right);
        return right;
    }

    public static int partition2(int[] array, int left, int right) {
        int pivot = array[right];

        int i = left - 1;

        for (int j = left; j <= right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, j, i);
            }
        }

        swap(array, right, i + 1);
        return i + 1;
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int index = partition(array, left, right);
            quicksort(array, left, index - 1);
            quicksort(array, index + 1, right);
        }
    }

    public static void quicksort2(int[] array, int left, int right) {
        if (left < right) {
            int index = partition2(array, left, right);
            quicksort2(array, left, index - 1);
            quicksort2(array, index + 1, right);
        }
    }

}
