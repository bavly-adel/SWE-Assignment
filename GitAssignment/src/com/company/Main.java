package com.company;

public class Main {

    public static void main(String[] args) {



    }


    public static boolean checkSort(double[] array){

        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
