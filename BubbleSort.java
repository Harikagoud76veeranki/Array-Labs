package com.apjfsa;

// Program to demonstrate Bubble Sort using array elements
public class BubbleSort {
    public static void main(String[] args) {
        // Initializing an array
        int arr[] = {3, 2, 8, 7, 6};

        int i, j;

        // Displaying the original array
        System.out.println("Original Array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

        // Bubble Sort algorithm
        for (i = 0; i < arr.length - 1; i++) {
            // Comparing adjacent elements
            for (j = 0; j < arr.length - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("\nSorted array using bubble sort: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
