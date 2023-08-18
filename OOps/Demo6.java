class A
{
	A()
	{
		System.out.println("Default COnstructor");
	}
	A(int id,String name)
	{
		
		System.out.println(id);
		System.out.println(name);
	}
	
	A(int age,int salary,String desig)
	{
		System.out.println(age);
		System.out.println(salary);
		System.out.println(desig);	
	}
}
class B
{
	//A(int id,String name){}
	
}
class Demo6
{
	public static void main(String args[])
	{
		A a = new A();
		A a1 = new A(100,"Thanesh");
		A a2= new A(25,500000,"Developer");
	}
}
// same constructer name  + multiple times + different paramater + in same class  = Constructor Over loding 