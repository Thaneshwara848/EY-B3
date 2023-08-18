class Bank
{
	public void loan()
	{
		System.out.println("8%");
	}
}
class SBI extends Bank
{	
	public  void loan()
	{
		System.out.println(" own implementation with 10%");
	}
}
class Axis extends Bank
{	
	public void loan()
	{
		System.out.println(" own implementation with 12%");
	}
}
class ICICI extends Bank{}
class Demo9
{
	public static void main(String args[])
	{
		Axis a = new Axis();
		a.loan();

		SBI s = new SBI();
		s.loan();
		
		ICICI i = new ICICI();
		i.loan();	
	}
}
// same method name  + same signature  + bur different implemention + in child class  = method Over riding 