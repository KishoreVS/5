package lab5;

import java.util.Scanner;

class FibonacciException extends Exception
{
	private int a,b,c;
	public FibonacciException(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void run(int n)
	{
		System.out.println("Fibonacci Series...");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(b+" ");
		}
	}
}
public class Ex2 {
static void fibo(int n)throws FibonacciException
{
	int a=0,b=1,c=1;

	for(int i=1;i<=n;i++)
	{
		a=b;
		b=c;
		c=a+b;
		System.out.println(b+" ");
	}
}
public static void main(String[] args) throws FibonacciException {
	int n;
	FibonacciException e=new FibonacciException(0, 1, 1);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	n=sc.nextInt();
	Ex2.fibo(n);
	e.run(n);
	System.out.println("\n");
	sc.close();
}
}
