package com.company;

public class Main {

  /** Print-Largest Method**/
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

    /** Min-3 Method **/
    public static int[] Get_Min3(int []arr){
        int len=arr.length;
        int []Copy_Array=new int[len];
        for(int i=0;i<len;i++) {
            Copy_Array[i]=arr[i];
        }
        len=len-1;
        for(int i=0;i<len;i++) {
            for(int j=0;j<len-i;j++) {
                if (Copy_Array[j]>Copy_Array[j+1])
                {
                    int tmp=Copy_Array[j];
                    Copy_Array[j]=Copy_Array[j+1];
                    Copy_Array[j+1]=tmp;
                }
            }}
        int []min_3element= {Copy_Array[0],Copy_Array[1],Copy_Array[2]};
        return min_3element;
    }
  
  /** Main Method**/
    public static void main(String[] args) {
	
    }
}
