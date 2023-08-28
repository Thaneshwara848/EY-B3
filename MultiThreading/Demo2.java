class A implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				if(Thread.currentThread().getName().equals("A"))
				{
						System.out.println(Thread.currentThread().getName()+"  :"+i );	
				}
				if(Thread.currentThread().getName().equals("B"))
				{
						System.out.println("	"+Thread.currentThread().getName()+"  :"+i );	
				}
				if(Thread.currentThread().getName().equals("C"))
				{
						System.out.println("		"+Thread.currentThread().getName()+"  :"+i );	
				}
				
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class Demo2
{
	public static void main(String args[])
	{	
		A a =new A();
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		Thread t3= new Thread(a);
		t1.start();
		t2.start();
		t3.start();

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		t1.setPriority(1);
		t2.setPriority(7);
		t1.setPriority(9);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
