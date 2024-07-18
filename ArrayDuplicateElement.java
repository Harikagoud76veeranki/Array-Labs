package com.apjfsa;

public class ArrayDuplicateElement {
    public static void main(String[] args) {
        // Declaring and initializing an array with duplicate elements
        int[] arr = {2, 4, 3, 5, 2, 4, 7, 8};

        // Variable to count the total number of duplicate elements
        int TotNum = 0;

        // Printing the message for duplicate elements
        System.out.println("Duplicate Elements in the array:");

        // Outer loop to traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to compare elements with the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                // Checking if the current element is equal to the next element
                if (arr[i] == arr[j]) {
                    // Printing the duplicate element
                    System.out.print(arr[j] + " ");
                    // Incrementing the total count of duplicate elements
                    TotNum++;
                }
            }
        }

        // Printing the total number of duplicate elements
        System.out.println("\nThe Number of duplicate values: " + TotNum);
    }
}
