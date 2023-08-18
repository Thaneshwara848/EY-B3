class Parent 
{
	int site=5;
	String car ="BMW";
	int amount=500000;
	void Pdisplay()
	{
		System.out.println("parent Site :"+site);
		System.out.println("parent CAR "+car);
		System.out.println("parent Amount :"+amount);		
	}
}
class Child extends Parent
{
	String car ="Maruthi";	
	int amount=200000;
	void Cdisplay()
	{
		System.out.println("================");
		System.out.println("parent Site :"+site);
		System.out.println("CHILD CAR "+car);
		System.out.println("parent CAR "+super.car);
		System.out.println("parent Amount :"+amount);
		System.out.println("Full Amount :"+(amount+super.amount));		
	}
}
class Demo2
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.Pdisplay();

		Child c = new Child();
		c.Cdisplay();	
	}
}
