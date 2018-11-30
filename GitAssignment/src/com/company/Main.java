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
}
