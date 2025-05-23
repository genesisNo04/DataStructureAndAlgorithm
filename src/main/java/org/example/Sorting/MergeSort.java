package org.example.Sorting;

import java.util.Arrays;

public class MergeSort {

    //Array slicing
    public int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;

        int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] rightArray = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(leftArray, rightArray);
    }

    public int[] merge(int[] array1, int[] array2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int[] result = new int[array1.length + array2.length];
        int writePointer = 0;

        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] < array2[pointer2]) {
                result[writePointer] = array1[pointer1];
                pointer1++;
                writePointer++;
            } else {
                result[writePointer] = array2[pointer2];
                pointer2++;
                writePointer++;
            }
        }

        while (pointer1 < array1.length) {
            result[writePointer] = array1[pointer1];
            pointer1++;
            writePointer++;
        }

        while (pointer2 < array2.length) {
            result[writePointer] = array2[pointer2];
            pointer2++;
            writePointer++;
        }

        return result;
    }

    //in place using index
    public void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            array[left + x] = temp[x];
        }
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(array, 0, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }
}
