import java.util.Scanner;
class Clerk
{
	int id,age;
	String name;
	int salary=20000;
	String desig="Clerk";
	Clerk()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID  :");
		id=sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Age  :");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Desig :"+desig);
	}
}
class Dev
{
	int id,age;
	String name;
	int salary=30000;
	String desig="Dev";
	Dev()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID  :");
		id=sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Age  :");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Desig :"+desig);
	}
}
class Tester
{
	int id,age;
	String name;
	int salary=25000;
	String desig="Tester";
	Tester()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID  :");
		id=sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Age  :");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Desig :"+desig);
	}
}
	

class Manager
{
	int id,age;
	String name;
	int salary=50000;
	String desig="Manager";
	Manager()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID  :");
		id=sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Age  :");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Desig :"+desig);
	}
}


class Demo3
{
	public static void main(String args[])
	{
		System.out.println("============Clerk ==============");
		Clerk c = new Clerk();	
		c.display();

		System.out.println("============Developer ==============");
		Dev d = new Dev();
		d.display();
		
		System.out.println("============Tester ==============");
		Tester t = new Tester();
		t.display();

		System.out.println("============Manager==============");
		Manager m = new Manager();
		m.display();
	}
}

		4 to 4 : 20 will the break : 

		