class A implements Runnable
{
	public void run()			// it sready to run and running 
	{
		try
		{
			for(int i=0;i<=50;i++)
			{
				if(Thread.currentThread().getName().equals("BMW"))
				{
						System.out.println(Thread.currentThread().getName()+"  :"+i );	// to check which thread is executin gcorrecntly 
				}
				if(Thread.currentThread().getName().equals("AUDI"))
				{
						System.out.println("	  "+Thread.currentThread().getName()+"  :"+i );	
				}
				if(Thread.currentThread().getName().equals("BENZ"))
				{
						System.out.println("		    "+Thread.currentThread().getName()+"  :"+i );	
				}
				
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class Dem03
{
	public static void main(String args[])
	{	
		A a =new A();
		Thread t1= new Thread(a);// baby= born 
		Thread t2= new Thread(a);
		Thread t3= new Thread(a);
		t1.start();			// baby is ready to run but not immmidetly 
		t2.start();
		t3.start();
		t1.setName("BMW");
		t2.setName("AUDI");
		t3.setName("BENZ");
		t1.setPriority(9);
		t2.setPriority(3);
		t3.setPriority(7);
		try
		{
			for(int k=0;k<=50;k++)
			{
				if(k==10)
				{
					t1.suspend();// block state 
				}
				if(k==20)
				{
					t1.resume();
				}
				if(k==15)
				{
					System.out.println("T1 Thread is ALive ? :"+t1.isAlive());// just to check wether thread is still alove or not 
				}
				if(k==25)
				{
					t1.stop();  // killling the thread 
				}
				if(k==30)
				{
					System.out.println("T1 Thread is ALive ? :"+t1.isAlive());
				}				
				System.out.println("				K : "+k);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
		}
	
	}
}
	