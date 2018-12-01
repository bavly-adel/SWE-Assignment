package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
	

    public static int getMedian(int[] input){

        // Median of array of N values
        // If N is odd  => The median will be at (N + 1) / 2 (middle value)
        // If N is even => The median will be the average of (N/2 , N/2 + 1)
        
        int [] temp = Arrays.copyOf(input, input.length);
        int len = temp.length;
        boolean even = (len % 2) == 0;
        int medianPosition = even ? (int) (len / 2.0) :  ((len + 1) / 2) - 1;

        // SORT THE INPUT ARRAY BEFORE SELECTING THE MEDIAN
         for (int i = 0 ; i < len-1 ; i++)
             for (int j = i + 1; j < len  ; j++)
                 if (temp[i] > temp[j]){
                     int x = temp[j];
                     temp[j] = temp[i];
                     temp[i] = x;
                 }

        // RETURN THE MEDIAN
        return even ? (temp[medianPosition] + temp[medianPosition + 1] / 2) : temp [medianPosition];
    }
}
