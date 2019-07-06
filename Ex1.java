package lab5;

import java.util.Scanner;
class MyException extends Exception{
	private String color;
	public MyException(String color )
	{	System.out.println("Enter a valid color");
		
	}
}
public class Ex1 {

static void ColorEx(String color) throws MyException
{	
	switch(color)
	{
	case "red":
		System.out.println("STOP....!!!!");
		break;
	case "yellow":
		System.out.println("READY...!!!!");
		break;
	case "green":
		System.out.println("GO...!!!!");
		break;
	default:
		throw new MyException(color);   
			
	}
}
public static void main(String[] args) throws MyException {
	String color;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a colour(red/yellow/green):");
	color=sc.next();
	Ex1.ColorEx(color);
	sc.close();
}
}