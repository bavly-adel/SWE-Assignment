package com.company;

public class Main {

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

           
    }
}
