class Parent 
{
	Parent()
	{
		System.out.println("Hi Parent ....!");
		// as soon as u create a child class object , the autoacticall parent class default constructor will gets call 
	}
}
class Child  extends Parent
{
	Child()
	{
		System.out.println("Child ...!");
	}
}
class Demo3
{
	public static void main(String args[])
	{
		//Parent p = new Parent();
		Child c = new Child();
	}
}
