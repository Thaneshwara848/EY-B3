class Emp
{
	private int id;
	private String name;
	//age
	//salary 
	// desig

	void setId(int id)
	{
		this.id=id;	
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;	
	}
	String getName()
	{
		return name;
	}
}
class Dem015
{
	public static void main(String args[])
	{
		Emp e = new Emp();
		e.setId(100);
		e.setName("Thanesh");
		System.out.println(e.getId());		
		System.out.println(e.getName());
	}
}
