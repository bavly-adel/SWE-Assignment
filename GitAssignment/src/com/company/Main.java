
package com.company;


import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.util.Random;
public class Main {

	/** Print-Largest Method **/
	public static void Print_largest(int arr[], int arr_size) {
		int first, second, third;

		if (arr_size < 3) {
			System.out.print(" Invalid Input, please try again  ");
			return;
		}

		first = second = third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++) {

			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			}

			else if (arr[i] > third)
				third = arr[i];
		}

		System.out.println("Three largest elements are=> " + first + " " + second + " " + third);
	}

	/* Most Repeated Method */
	public static void get_most_reapeated(int[] arr) {
		int most = 0;
		int temp = 0;
		int count = 0, tempcount;

		for (int j = 0; j <= arr.length - 1; j++) {
			temp = arr[j];
			tempcount = 0;
			for (int k = 1; k <= arr.length - 1; k++) {
				if (temp == arr[k]) {
					tempcount++;
				}
				if (count < tempcount) {
					most = arr[k];
					count = tempcount;
				}
			}

		}
		System.out.println("the most repeated value is : " + most);
	}

	/* Check palindrome */
	public static boolean isPalindrome(String arr, int choice) {
		String t = "";
		int n = arr.length();
		if (choice == 1) {
			for (int i = 0; i < n; i++) {
				if (arr.charAt(i) != ' ') {
					t += arr.charAt(i);
				}
			}
		} else {
			t = arr;
		}
		int p2 = t.length() - 1, sz = p2 + 1;
		for (int p = 0; p < sz / 2; p++) {
			if (arr.charAt(p) != arr.charAt(p2))
				return false;
			p2--;
		}
		return true;
	}

	/** Min-3 Method **/
	public static int[] Get_Min3(int[] arr) {
		int len = arr.length;
		int[] Copy_Array = new int[len];
		for (int i = 0; i < len; i++) {
			Copy_Array[i] = arr[i];
		}
		len = len - 1;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				if (Copy_Array[j] > Copy_Array[j + 1]) {
					int tmp = Copy_Array[j];
					Copy_Array[j] = Copy_Array[j + 1];
					Copy_Array[j + 1] = tmp;
				}
			}
		}
		int[] min_3element = { Copy_Array[0], Copy_Array[1], Copy_Array[2] };
		return min_3element;
	}

	public static boolean checkSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				continue;
			} else {
				return false;
			}
		}
		return true;

	}

	public static void get_avg(int[] arr) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			x += arr[i];
		}
		x /= arr.length;
		System.out.println("the average is " + x);
	}

	public static void getSmallest(int[] arr) {

		int sz = arr.length;
		int[] arr1;
		arr1 = new int[sz];
		int i = 0, z = 0;

		while (i < sz) {
			int c = 0;
			for (int j = 2; j <= arr[i]; j++) {
				if (arr[i] % j == 0 && arr[i] != j) {
					c++;
					break;
				}

			}
			if (c == 0) {
				arr1[z] = arr[i];
				z++;
			}
			i++;

		}

		int t = arr1[0];
		for (int ii = 0; z > ii; ii++) {

			if (arr1[ii] < t) {
				t = arr1[ii];

			}

		}
		System.out.print("the smallest prime is : " + t);
	}

	public static int getMedian(int[] input) {

		// Median of array of N values
		// If N is odd => The median will be at (N + 1) / 2 (middle value)
		// If N is even => The median will be the average of (N/2 , N/2 + 1)

		int[] temp = Arrays.copyOf(input, input.length);
		int len = temp.length;
		boolean even = (len % 2) == 0;
		int medianPosition = even ? (int) (len / 2.0) : ((len + 1) / 2) - 1;

		// SORT THE INPUT ARRAY BEFORE SELECTING THE MEDIAN
		for (int i = 0; i < len - 1; i++)
			for (int j = i + 1; j < len; j++)
				if (temp[i] > temp[j]) {
					int x = temp[j];
					temp[j] = temp[i];
					temp[i] = x;
				}

		// RETURN THE MEDIAN
		return even ? (temp[medianPosition] + temp[medianPosition + 1] / 2) : temp[medianPosition];
	}

	public static void Reverse_arr(String arr[]) {
		String a[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = arr[arr.length - i - 1];
			System.out.println(a[i]);
		}
	}

	public static void Distinct(int[] arr) {
		String temp = "";
		String collect = "";
		boolean flag = false;
		int x;
		for (int i = 0; i < arr.length; i++) {
			collect += arr[i];
			collect += " ";
		}
		ArrayList<String> values = new ArrayList<String>(Arrays.asList(collect.split(" ")));
		ArrayList<String> add = new ArrayList<>();
		for (int i = 0; i < values.size(); i++) {

			x = add.indexOf(values.get(i));
			if (x == -1)
				add.add(values.get(i));

		}
		for (int i = 0; i < add.size(); i++)
			System.out.print(add.get(i) + " ");

	}

	public static void sort(int array[], int size) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			data.add(array[i]);
		}

		data.sort(null);
		System.out.println(data);
	}
                  public  static int[] shufflearray(int array[]){  
                 int arr[]=new int[array.length];
       for (int j=0;j<array.length;j++){arr[j]=array[j];}
            Random rnd = new Random();
       for( int i=0;i<arr.length;i++){
           int randomposition=rnd.nextInt(arr.length);
           //to swap the element 
           int temp=arr[i];
           arr[i]=arr[randomposition];
           arr[randomposition]=temp;
       } 
     
        for (int k = 0; k < arr.length; k++)
    {
      System.out.print(arr[k] + " ");
    }
    System.out.println();
			   
       return arr;
}
	public static void main(String[] args)
    {


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Git Assignment team 9");
            System.out.println("Select the type of data you want to enter : 1 for numbers or 2 for chars ");
            int choicee = input.nextInt();
            if (choicee == 1) {
                System.out.println("Please Enter The array size");
                int size = input.nextInt();
                System.out.println("Please enter the element of tha array");
                int[] arr = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = input.nextInt();
                }
                System.out.println();
                System.out.println("Slect the function you want to excute :");
                System.out.println("1.Most repeated value");
                System.out.println("2.sort");
                System.out.println("3.Shuffle");
              //  System.out.println("4.Find largest prime");
                System.out.println("5.Find Smallest prime");
                System.out.println("6.Check Palindrome");
                System.out.println("7.check sorted");
            //    System.out.println("8.Count primes");
                System.out.println("9.Reverse array");
              //  System.out.println("10.shift array");
                System.out.println("11.Distinct Array");
                System.out.println("12.Get maximum 3 numbers");
                System.out.println("13.Get minimum 3 numbers");
                System.out.println("14.Get average");
                System.out.println("15.Get median");
              //  System.out.println("16.Return only primes");
             //   System.out.println("17.Zero if less than zero");
                System.out.println("18.Excute All");
                int choice =input.nextInt();
                if (choice == 1) {
                    get_most_reapeated(arr);
                }
                else if (choice == 2) {
                    int s=arr.length;
                    sort(arr,s);
                }
                else if (choice == 3) {
                        shufflearray(arr);
                }
                else if (choice == 4) {



                }
                else if (choice == 5) {
                    getSmallest(arr);
                }
                else if (choice == 6) {

                	String t="";
                	int n=arr.length;
                	for(int i=0;i<n;i++)
                	{
                		t+=Integer.toString(arr[i]);
                	}
                	if(isPalindrome(t,0))
                	{
                		System.out.println("Palindrome");
                	}
                	else
                	{
                		System.out.println("NotPalindrome");
                	}




                }
                else if (choice == 7) {
                    boolean res= checkSort(arr);
                    if(res)
                    {
                        System.out.println("Sorted");
                    }
                    else {
                        System.out.println("Not Sorted");
                    }
                }
                else if (choice == 8) {

                }
                else if (choice == 9) {

         String a[]=new String [arr.length];
        for(int i=0;i<arr.length ;i++)
           {
            a[i]=Integer.toString(arr[i]);

           }
			Reverse_arr(a);
             }



                else if (choice == 10) {

                }
                else if (choice == 11) {
                Distinct(arr);
                }
                else if (choice == 12) {

                      Print_largest(arr, arr.length);
                }
                else if (choice == 13) {
                    int [] Res=Get_Min3(arr);
                    for(int i=0;i<Res.length;i++)
                        System.out.print(Res[i]+", ");
                    System.out.println();
                }
                else if (choice == 14) {

                     get_avg(arr);
                }
                else if (choice == 15) {



                	int res=getMedian(arr);
                	System.out.println("Median is "+res);

                }

                else if (choice == 16) {

                }
                else if (choice == 17) {


                }



                else if (choice == 18) {
                    get_most_reapeated(arr);
			shufflearray(arr);

                    int [] Res=Get_Min3(arr);
                    for(int i=0;i<Res.length;i++)
                        System.out.print("Min 3 are : "+Res[i]+", ");
                    System.out.println();
                    getSmallest(arr);

                    boolean ress= checkSort(arr);
                    if(ress)
                    {
                        System.out.println("Sorted");
                    }
                    else {
                        System.out.println("Not Sorted");
                    }
                    Print_largest(arr, arr.length);

			 String a[]=new String [arr.length];
        for(int i=0;i<arr.length ;i++)
        {
            a[i]=Integer.toString(arr[i]);

          }
			Reverse_arr(a);
			get_avg(arr);

			int res=getMedian(arr);
        	System.out.println("Median is "+res);
        	sort(arr,arr.length);

        	String t="";
        	int n=arr.length;
        	for(int i=0;i<n;i++)
        	{
        		t+=Integer.toString(arr[i]);
        	}
        	if(isPalindrome(t,0))
        	{
        		System.out.println("Palindrome");
        	}
        	else
        	{
        		System.out.println("NotPalindrome");
        	}
        	Distinct(arr);

                }
                else {
                    System.out.println("Invalid Choice");
                }

            }else if(choicee==2)

	{
		System.out.println("Please Enter Your String:");
		String word = input.next();
		String[] arr = word.split("");
		System.out.println();
		System.out.println("Slect the function you want to excute :");
		System.out.println("1.Check Palindrome");
		System.out.println("2.Reverse array");
	//	System.out.println("3.shift array");
		System.out.println("4.Excute All");
		int choice = input.nextInt();
		if (choice == 1) {

		} else if (choice == 2) {

			Reverse_arr(arr);

			String t = word;
			if (isPalindrome(t, 0)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("NotPalindrome");
			}

		} else if (choice == 3) {

		} else if (choice == 4) {

			Reverse_arr(arr);
			System.out.println();
			Reverse_arr(arr);

			String t = word;
			if (isPalindrome(t, 0)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("NotPalindrome");
			}

		} else {
			System.out.println("Invalid Choice");
		}


	}else
	{
		System.out.println("Invalide choice");
	}

}

}

}
