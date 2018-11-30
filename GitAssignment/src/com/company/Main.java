package com.company;

public class Main {
         public static void Print_largest(int arr[], int arr_size) 
    { 
        int first, second, third; 
    
       
        if (arr_size < 3) 
        { 
            System.out.print(" Invalid Input, please try again  "); 
            return; 
        } 
        
        first = second =  third = Integer.MIN_VALUE; 
        for ( int i = 0; i < arr_size ; i ++) 
        { 
           
            if (arr[i] > first) 
            {   third = second; 
                second = first; 
                first = arr[i]; 
            } 
        
            else if (arr[i] > second) 
            { 
                third = second; 
                second = arr[i]; 
            } 
        
            else if (arr[i] > third) 
                third = arr[i]; 
        } 
        
        System.out.println("Three largest elements are=> " + first + " " + second + " " + third); 
    } 


    public static void main(String[] args) {
	
       int[]arr;
        int sizee ;
        Scanner input=new Scanner(System.in) ;
        System.out.println("Enter number of elemets that you want to get the largest three of them :");
        sizee=input.nextInt() ;
        arr=new int[sizee] ;
         Scanner in=new Scanner(System.in) ;
         System.out.println("Enter your data :");

        for(int i=0 ;i<sizee;i++) {
         arr[i]=in.nextInt() ;
        }
        Print_largest(arr,sizee) ;

    }
}
