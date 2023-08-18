class A
{
	A()
	{
	   for(int i=0;i<=5;i++)
	   {
		System.out.println("I :"+i);	
	   }
	}
	void abc()
	{
		for(int j=0;j<=5;j++)
	        {
		 System.out.println("	j :"+j);	
	        }
	}		
}
class B
{
	B()
	{
	   for(int k=0;k<=5;k++)
	   {
		System.out.println("K :"+k);	
	   }
	}
	void xyz()
	{
		
		 System.out.println("	LLLLLLLLLLLLLLL");	
	        
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		A a = new A();
		a.abc();
		a.abc();
		B b = new B();		
		b.xyz();
	}
}