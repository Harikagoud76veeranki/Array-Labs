package com.apjfsa;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring an array to store 6 numbers
        int arr[] = new int[6];

        // Prompting the user to enter numbers
        System.out.println("Enter Numbers: ");

        // Loop to read input values into the array
        for (int i = 0; i < 6; i++) {
            // Reading a number from the user and storing it in the array
            arr[i] = sc.nextInt();
        }

        // Initializing max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];

        // Loop to find the maximum and minimum values in the array
        for (int i = 1; i < arr.length; i++) {
            // Checking if the current element is greater than the max
            if (arr[i] > max) {
                // Updating the max value
                max = arr[i];
            }

            // Checking if the current element is smaller than the min
            if (arr[i] < min) {
                // Updating the min value
                min = arr[i];
            }
        }

        // Printing the maximum value
        System.out.println("Maximum value: " + max);

        // Printing the minimum value
        System.out.println("Minimum value: " + min);
    }
}
