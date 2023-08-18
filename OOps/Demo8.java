class A
{
	public void abc()
	{
		System.out.println("HI A class ABC Method");
	}
}
class B
{	
	public void abc()
	{
		System.out.println("HI B class ABC Method+ different implematation ");
	}
}
class Demo8
{
	public static void main(String args[])
	{
		B b = new B();
		b.abc();
	}
}

// same method name  + same signature  + in child class  = method Over loding 