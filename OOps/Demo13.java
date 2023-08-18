interface I
{
	int a =100; 
		// no constructor to initilize the variable .... we ahve to initilize 
	//public abstract void aaa();
	//public abstract void bbb();
	
}
interface J
{

}
interface K extends I,J
{

}
class Demo13
{
	public static void main(String args[])
	{
		//I i = new I(); not possible to creat object of interface 	
	}
}