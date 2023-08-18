class A
{
	void display()
	{
		System.out.println("Default COnstructor");
	}
	void display(int id,String name)
	{
		
		System.out.println(id);
		System.out.println(name);
	}
	
	void display(int age,int salary,String desig)
	{
		System.out.println(age);
		System.out.println(salary);
		System.out.println(desig);	
	}
}
class B
{	
}
class Demo7
{
	public static void main(String args[])
	{
		A a = new A();
		a.display(100,"Thanesh");
		a.display(25,500000,"Developer");
	}
}
// same constructer name  + multiple times + different paramater + in same class  = Constructor Over loding 
// same method name  + multiple times + different paramater + in same class  = method Over loding 