package org.example.SlidingWindow;

public class SlidingWindowMain {
    public static void main(String[] args) {
        SlidingWindow window = new SlidingWindow();

        int[] array = {5, 2, 6, 11, -5, 3, 1, -2, 10};

        System.out.println(window.slidingWindow(array, 3));
    }
}
