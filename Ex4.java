package lab5;

import java.util.Scanner;

class MyException extends Exception
{
	MyException()
	{
		System.out.println("Please enter valid first name and last name");
	}
	public String toString()
	{
		return "Blank";
	}
}


public class Ex4 {
	static void validation(String fname,String lname) throws MyException
	{
		if((fname.isEmpty()||lname.isEmpty()))
		{
			throw new MyException();//MyException obj
		}
		else
		{
			System.out.println(fname+" "+lname);
		}
	}
	public static void main(String[] args)throws MyException {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your First name");
			String fname=s.nextLine();
			System.out.println("Enter your Last name");
			String lname=s.nextLine();
			validation(fname,lname);
			s.close();
		}
	}
