package com.apjfsa;

// Program to merge two arrays and store in another array
public class MergeArray {
    public static void main(String[] args) {
        // Initialize the arrays arr1 and arr2
        int arr1[] = {2, 4, 6, 8, 10};
        int arr2[] = {3, 5, 7, 9};

        // Create a new array arr3 with the combined length of arr1 and arr2
        int arr3[] = new int[arr1.length + arr2.length];

        int i;

        // Copying the elements from arr1 to arr3
        for (i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Copying elements from arr2 to arr3 after that elements from arr1
        for (i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        // Printing the merged array arr3
        System.out.println("Merged Array is: ");
        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j] + " ");
        }
    }
}
