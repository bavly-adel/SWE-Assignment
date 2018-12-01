checkpalindrome
import java.util.*;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("Welcome at Team9 Project");
		System.out.println("Press 9 to Choose Check palindrome function");
		choice=sc.nextInt();
		if(choice==9)
		{

			//CheckPalindrome <String> obj0=new CheckPalindrome ();
			System.out.println("Slect the type of data you wanna check as 1 for numbers or 2 for chars");
			int selection=sc.nextInt();
			if(selection==1)
			{
				System.out.print("please Enter The array size:");
				int sz=sc.nextInt();
				System.out.println("Now fill your array:");
				Integer []arr=new Integer[sz];
				for(int i=0;i<sz;i++)
				{
					arr[i]=sc.nextInt();
				}
				CheckPalindrome <Integer> obj=new CheckPalindrome (sz);
				obj.setContainer(arr);
				if(obj.isPalindrome())
				{
					System.out.println("It is Palindrome:");
				}
				else
				{
					System.out.println("It is not Palindrome");
				}
			}
			else if(selection==2)
			{
				System.out.print("Please Enter Your String:");
				String word=sc.next();
				String []arr=word.split("");
				int sz=word.length();
				CheckPalindrome <String> obj=new CheckPalindrome (sz);
				obj.setContainer(arr);
				if(obj.isPalindrome())
				{
					System.out.println("It is Palindrome:");
				}
				else
				{
					System.out.println("It is not Palindrome");
				}

			}


		}


	}
}


/** This is My class To check if A container has numbers or Characters is or not Palindrome **/
class CheckPalindrome<E> {
	private Object [] Container;
	private int sz;
	CheckPalindrome()
	{
		System.out.println("*Please Make an array with your data,"+'\n'+"*Then pass its size to setsize method,"+'\n'+"*Pass the array it self to setContainer method "+'\n'+"*And finally call isPalindrome method");
		System.out.println();
	}
	CheckPalindrome(int n)
	{
		sz=n;
		Container=new Object[sz];
	}
	E get(int indx)
	{
		final E eobj=(E) Container[indx];
		return eobj;
	}
	void add(int indx,E val)
	{
		Container[indx]=val;
	}
	void setsize(int n)
	{
		sz=n;
	}
	void setContainer(E []arr)
	{
		Container=arr;
	}
	boolean isPalindrome()
	{

		int p2=sz-1;
		for(int p=0;p<sz/2;p++){
			if(!get(p).equals(get(p2)))return false;p2--;
		}
		return true;
	}
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


    

}
