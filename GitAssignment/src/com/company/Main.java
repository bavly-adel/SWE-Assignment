package com.company;


import java.util.Scanner;
import java.util.Arrays;

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

    
	/* Most Repeated Method*/
	public static void get_most_reapeated(int[]arr)
	{
		int most = 0;
		int temp=0;
		int count=0,tempcount;
		
		for(int j=0;j<=arr.length-1;j++)
		{
			temp=arr[j];
			tempcount=0;
			for(int k=1;k<=arr.length-1;k++)
			{
				if(temp==arr[k])
				{
					tempcount++;
				}   
					if(count<tempcount)
					{
						most=arr[k];
						count=tempcount;
					}
			}

		}
		System.out.println("the most repeated value is : "+most);
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
  
  
	
	
	public static boolean checkSort(int[] array){

        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                continue;
            }else {
                return false;
            }
        }
        return true;
	      
    }

	public static void getSmallest(int []arr)
    {

        int sz=arr.length;
  
        int [] arr1;
		arr1 = new int[sz];

        
        
        int i=0,z=0;
        while(i<sz)
        {
            int c=0;
            for(int j=2; j<=arr[i]; j++)
            {
                if(arr[i]%j==0 && arr[i]!=j)
                {
                    c++;
                    break;
                }

            }
            if(c==0)
            {arr1[z]=arr[i];z++;} i++;
        
        }
        
		int t=arr1[0];
        for(int ii=0; z>ii; ii++)
        {

			if(arr1[ii]<t)
			{
				t=arr1[ii];

			}
            
        }
        System.out.print("the smallest prime is : "+ t );        
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
	
	
	
	public static void main(String[] args) {

	
    }
    public static void Distinct(int []arr) {
		String temp="";
		String collect="";
        boolean flag=false;
        int x;
        for (int i = 0; i < arr.length; i++) {
        	collect+=arr[i];
        	collect+=" ";}
      ArrayList<String> values= new ArrayList<String>(Arrays.asList(collect.split(" ")));
      ArrayList<String> add=new ArrayList<>();
     for(int i=0;i<values.size();i++){
    	 
    	  x=add.indexOf(values.get(i));
    	 if(x==-1)
    		 add.add(values.get(i));
        	
        		
        }
     for(int i=0;i<add.size();i++)
        System.out.print(add.get(i)+" ");

           


	      int[] values={3,4,3,7,2,1,1,1,4};
	      get_most_reapeated(values);
	    getSmallest(values);
	    

    }
	


}
