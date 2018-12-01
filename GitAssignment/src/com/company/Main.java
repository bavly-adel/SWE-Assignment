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
                System.out.println("4.Find largest prime");
                System.out.println("5.Find Smallest prime");
                System.out.println("6.Check Palindrome");
                System.out.println("7.check sorted");
                System.out.println("8.Count primes");
                System.out.println("9.Reverse array");
                System.out.println("10.shift array");
                System.out.println("11.Distinct Array");
                System.out.println("12.Get maximum 3 numbers");
                System.out.println("13.Get minimum 3 numbers");
                System.out.println("14.Get average");
                System.out.println("15.Get median");
                System.out.println("16.Return only primes");
                System.out.println("17.Zero if less than zero");
                System.out.println("18.Excute All");
                int choice =input.nextInt();
                if (choice == 1) {
                    get_most_reapeated(arr);
                }
                else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                else if (choice == 4) {

                }
                else if (choice == 5) {
                    getSmallest(arr);
                }
                else if (choice == 6) {

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

                }
                else if (choice == 10) {

                }
                else if (choice == 11) {

                }
                else if (choice == 12) {

                }
                else if (choice == 13) {
                    int [] Res=Get_Min3(arr);
                    for(int i=0;i<Res.length;i++)
                        System.out.print(Res[i]+", ");
                    System.out.println();
                }
                else if (choice == 14) {

                }
                else if (choice == 15) {

                }
                else if (choice == 16) {

                }
                else if (choice == 17) {

                }
                else if (choice == 18) {
                    get_most_reapeated(arr);
                    int [] Res=Get_Min3(arr);
                    for(int i=0;i<Res.length;i++)
                        System.out.print(Res[i]+", ");
                    System.out.println();
                    getSmallest(arr);
                    checkSort(arr);


                }
                else {
                    System.out.println("Invalid Choice");
                }

            } else if (choicee == 2) {
                System.out.println("Please Enter Your String:");
                String word = input.next();
                String[] arr = word.split("");
                System.out.println();
                System.out.println("Slect the function you want to excute :");
                System.out.println("1.Check Palindrome");
                System.out.println("2.Reverse array");
                System.out.println("3.shift array");
                System.out.println("4.Excute All");
                int choice=input.nextInt();
                if (choice == 1) {

                }
                else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                else if (choice == 4) {

                }
                else {
                    System.out.println("Invalid Choice");
                }

            }
            else {
                System.out.println("Invalide choice");
            }

        }


    }




}


    


