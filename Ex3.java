package lab5;

import java.util.Scanner;

class MyException extends Exception{
	private int n;
	public MyException(int n)
	{	System.out.println("Prime number upto the number "+n);
		for(int i=2;i<n;i++)
		{	
			if(i!=4)
			System.out.println(i);
		}
		System.out.println(n);
	}
}
public class Ex3 {
	static void primenumbergen(int n) throws MyException
	{
		  int i,flag=0;            
		  if(n<=7)
		   throw new MyException(n);      
		  else
		  {  	System.out.println("Prime number upto the number "+n);
			   System.out.println("2\n3\n5\n7");
		   for(i=2;i<=n;i++)
		   {      
		    if((i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0))
		    {      
		     System.out.println(i);   
		    }      
		   }  

		  }
	}
	public static void main(String args[]) throws MyException{    
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		Ex3.primenumbergen(n);
		s.close();
		}   
}
