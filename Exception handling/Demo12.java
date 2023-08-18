import java.io.*;
class A
{
	void display() throws FileNotFoundException,IOException,NumberFormatException,MaxAgeException
	{
		for(int i=0;i<=20;i++)
		{
			
			if(i==18) throw new NumberFormatException();
			if(i==16) throw new NullPointerException();
			if(i==13) throw new ArrayIndexOutOfBoundsException();

			if(i==15) throw new FileNotFoundException();
			if(i==12) throw new IOException();
			
			if(i==10) throw new MaxAgeException("max age is only 60");
			
			System.out.println("I : "+i);
		}
	}
}
class Demo12
{
	public static void main(String args[]) 
	{
		try
		{
			A a = new A();
			a.display();		
		}
		catch(NumberFormatException nf)
		{
			System.out.println("Number format Exception came ");
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("  FileNotFoundException came ");
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(" ArrayIndexOutOfBoundsException  came ");
		}
		catch(IOException io)
		{
			System.out.println(" IOException  came ");
		}
		catch(NullPointerException np)
		{
			System.out.println(" NullPointerException  came ");
		}
		catch(MaxAgeException ma)
		{
			System.out.println(ma);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you....!");
		}
	}	
}

class MaxAgeException extends Exception 
{
	MaxAgeException()
	{
	
	}
	MaxAgeException(String str)
	{
		super(str);
	}
}



		input1={1,4,6,8,4,60,2,50} 
		input2 ={56,25,2,5,60,20,50}
		input3={45,67,4,2,5,6,2,50,60};
		input4 

				50 , 60 

Write a program 

		1 ) Sort the beaded on assending 
		2 ) Write a program to find the common element in the array
		3) add all the elements into single array 
		4 ) and saparate the even and odd number  : [even ] and [odd] : saparate array


		What is exception ?
		how many ways to handle it ?
		difference between checked and unched exception
		what is try and catch 
		diffference between throw and throws 
		difference final and finally 
		list 5 name of check exception 
		list 5 name of unchecked exception 
		Steps to create a Coustum exception 
		what is throwable 










		
 




