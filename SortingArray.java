package com.apjfsa;

// Class for sorting an array in descending order
public class SortingArray {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int arr[] = {13, 24, 7, 9, 14, 19, 25};

        // Temporary variable for swapping elements
        int temp;

        // Outer loop to traverse the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop to compare and swap elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Checking if the current element is smaller than the next element
                if (arr[j] < arr[j + 1]) {
                    // Swapping the elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the message for the sorted array
        System.out.println("\nSorted array: ");

        // Loop to print the sorted array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
