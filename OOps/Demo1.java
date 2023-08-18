// parent- super - base 
class A
{
	int a=100;
	int b=200;

	void display()
	{
		System.out.println("Hi Display method....!"+(a+b));
	}
}
// child - sub - dervied 
class B extends A
{ 
	//int a=100; inheriting from A class 
	//int b=200; inheriting from A class 
	int c=300;
	int d=400;

	void abc()
	{
		System.out.println("Hi ....!"+(a+b));
		System.out.println("Hello "+(c+d));
	}
}
class Demo1
{
	public static void main(String args[])
	{
		B b = new B();
		b.abc();
	}
}
// reduce the lines of code 
// we can re use the code 
// parent- super - base 
// child - sub - dervied 