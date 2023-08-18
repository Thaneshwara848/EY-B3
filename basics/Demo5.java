class A
{
	static int x=1000;
	static void display()
	{
		System.out.println("Hiiiiiiiiiiiiiiii");
	}
}
class Demo5
{
	public static void main(String args[])
	{
		
		A a = new A();
		a.display();
		System.out.println(a.x);


		A a1 = new A();	
		a1.display();
		System.out.println(a1.x);

		System.out.println("=====================================");
		
		A.display();
		System.out.println(A.x);
		
	}
}