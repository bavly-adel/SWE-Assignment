package com.company;
	import java.util.ArrayList;
	import java.util.Arrays;
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

    public static void main(String[] args) {
	      int[] values={3,4,3,7,2,1,1,1,4};
	      get_most_reapeated(values);
    }
	public class sort {
		public static void main(String[] args) {
			ArrayList<Integer> data = new ArrayList<Integer>();
			 Scanner input = new Scanner(System.in);
             double []arr;
			System.out.println("enter the size of the array");
		
			int size=input.nextInt();
		arr=new double[size];

	for(int i=0;i<size;i++)
	{
	int temp= input.nextInt();
	data.add(temp);
	}
	data.sort(null);
	System.out.println(data);	
  }
}
}
