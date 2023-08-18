import java.util.*;
import java.io.*;
class Demo9
{
	public static void main(String args[]) 
	{
		m1();
	}	
	static void m1() 
	{
		m2();System.out.println("Hi M1 ");
	}
	static void m2()  
	{
		m3();System.out.println("Hi M2 ");
	}
	static void m3() 
	{
		try
		{
			Scanner sc =  new Scanner(System.in);
			System.out.println("Enter A value :");
			int a = sc.nextInt();
			System.out.println("Enter B value :");
			int b = sc.nextInt();
			int res = a/ b;
			System.out.println("Result is : "+res );
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Hy Boss we cant devide anything by 0 ");
		}
		catch(InputMismatchException i)
		{
			System.out.println("Hy Brother please enter Only Number  ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you ");
		}			
	}
}
