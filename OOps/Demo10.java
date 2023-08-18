abstract class Bank
{
	abstract void roi();
	abstract void atm();// process of hiding the implementation . and only show the funcinality to the end user
}
class Sbi extends Bank
{
	void roi()
	{
		System.out.println(" SBI 10 %");
	}
	void atm()
	{
		// boss please come and take the ATM 
	}
}
class Axis extends Bank
{
		// you must have to over ride 
	void roi()
	{
		System.out.println(" AXIS 10 %");
	}
	void atm()
	{		
	}
}	
class Demo10
{

	public static void main(String args[])
	{
		Sbi s = new Sbi();
		s.roi();	
		Axis a = new Axis();
		a.roi();	
	}
}