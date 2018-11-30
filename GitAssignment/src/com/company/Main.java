package com.company;

import java.util.Scanner;

public class Main {

    public static void getSmallest()
    {
                System.out.println("Get Smallest");
        System.out.println("Please Enter size of array");
        int sz;
        Scanner in = new Scanner(System.in);
        sz = in.nextInt();
        Integer [] arr = new Integer[sz];
        System.out.println("Please Enter your array");
        for (int i = 0 ; i < sz ; ++i){
            arr[i] = in.nextInt();
}
        int t=0;
        for(int i=0; i<sz; i++)
        {
            for(int j=i+1; j<sz; j++)
            {
                if(arr[i]<arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.print("the smallest number is : "+ t );
    }
    public static void main(String[] args) {
	// write your code here
        
    }
    
}
