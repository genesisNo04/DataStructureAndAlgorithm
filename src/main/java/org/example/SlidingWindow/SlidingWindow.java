package org.example.SlidingWindow;

public class SlidingWindow {

    public int slidingWindow(int[] array, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        int maxSum = sum;

        for (int i = k; i < array.length; i++) {
            sum += array[i];
            sum -= array[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
