package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
	
    public static double getMedian(double[] input){

        // Median of array of N values
        // If N is odd  => The median will be at (N + 1) / 2 (middle value)
        // If N is even => The median will be the average of (N/2 , N/2 + 1)

        int len = input.length;
        boolean even = (len % 2) == 0;
        int medianPosition = even ? (int) (len / 2.0) :  ((len + 1) / 2) - 1;

        // SORT THE INPUT ARRAY BEFORE SELECTING THE MEDIAN
         for (int i = 0 ; i < len-1 ; i++)
             for (int j = i + 1; j < len  ; j++)
                 if (input[i] > input[j]){
                     double temp = input[j];
                     input[j] = input[i];
                     input[i] = temp;
                 }

        // RETURN THE MEDIAN
        return even ? (input[medianPosition] + input[medianPosition + 1] / 2.0) : input [medianPosition];
    }
}
