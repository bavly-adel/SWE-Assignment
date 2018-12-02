package com.company;
import java.util.Random;
public class Main {
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

 public  static int[] shufflearray(int array[]){
       Random rnd = new Random(); 
       for(int i=0;i<array.length;i++){
           int randomposition=rnd.nextInt(array.length);
           //to swap the element 
           int temp=array[i];
           array[i]=array[randomposition];
           array[randomposition]=temp;
       }
     //  System.out.print("the element before shuffle --->");
       // for (int j = 0; j < array.length; j++)
    //{
      //System.out.print(array[j] + " ");
    //}
      //  System.out.println(); 
        for (int k = 0; k < array.length; k++)
    {
      System.out.print(array[k] + " ");
    }
    System.out.println();
       return array;
   
   }

    public static void main(String[] args) {
	// write your code here
       int []arrayofelement={7,9,3,5,6};
        shufflearray(arrayofelement);
    }
}
