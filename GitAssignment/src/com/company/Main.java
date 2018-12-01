package com.company;


import java.util.Scanner;


public class Main {
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

          public static void getSmallest(int []arr)
    {

        int sz=arr.length;
  
        int [] arr1;
            arr1 = new int[sz];

        
        
        int i=0,z=0;
        while(i<sz)
        {
            int c=0;
            for(int j=2; j<=9; j++)
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
    public static void main(String[] args) {

	      int[] values={3,4,3,7,2,1,1,1,4};
	      get_most_reapeated(values);
	    getSmallest(values);
	    

    }
    
}
