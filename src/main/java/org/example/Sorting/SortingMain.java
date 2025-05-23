package org.example.Sorting;

import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {
//        BubbleSort bubbleSort = new BubbleSort();
//        int[] array = {1, 13, 30, 8, 25, 6, 5, 11};
//        System.out.println("Before sort: " + Arrays.toString(array));
//        bubbleSort.bubbleSort(array);
//        System.out.println("After sort: " + Arrays.toString(array));

//        InsertionSort insertionSort = new InsertionSort();
//        int[] array = {1, 13, 11, 8, 25, 6, 5, 30};
//        System.out.println("Before sort: " + Arrays.toString(array));
//        insertionSort.insertionSort(array);
//        System.out.println("After sort: " + Arrays.toString(array));

//        SelectionSort selectionSort = new SelectionSort();
//        int[] array = {1, 13, 11, 8, 25, 6, 5, 30};
//        System.out.println("Before sort: " + Arrays.toString(array));
//        selectionSort.selectionSort(array);
//        System.out.println("After sort: " + Arrays.toString(array));

//        MergeSort mergeSort = new MergeSort();
//        int[] array = {1, 13, 11, 8, 25, 6, 5, 30};
//        System.out.println("Before sort: " + Arrays.toString(array));
//        mergeSort.mergeSort(array, 0, array.length - 1);
//        System.out.println("After sort: " + Arrays.toString(array));

//        QuickSort quickSort = new QuickSort();
//        int[] array = {10, 16, 8, 12, 15, 6, 3, 9, 5};
//        System.out.println("Before sort: " + Arrays.toString(array));
//        quickSort.quickSort2(array, 0, array.length - 1);
//        System.out.println("After sort: " + Arrays.toString(array));

        HeapSort heapSort = new HeapSort();
        int[] array = {10, 16, 8, 12, 15, 6, 3, 9, 5};
        System.out.println("Before sort: " + Arrays.toString(array));
        heapSort.heapSort(array);
        System.out.println("After sort: " + Arrays.toString(array));
    }



}
