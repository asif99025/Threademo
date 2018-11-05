//just an comment
//added from eclipse from first

class  increment 
{
int count;
public synchronized void inc()
{
count++;
}
}


public class ThreadDemo {

	public static void main(String[] args) throws Exception{

		increment in =new increment();
		
		double as=3_5_2.0;
		float ef=(float) 2_123456;
		System.out.println("as :"+as+"ef"+ef);
		
		int corecount =Runtime.getRuntime().availableProcessors();
		System.out.println("core count"+corecount);
		Thread t1=new Thread(new Runnable () {
			public void run() 
			{
				for(int i=0;i<1000;i++)
				{
					in.inc();
				}
				
			}
			
		});
		Thread t2=new Thread(new Runnable () {
			public void run() 
			{
				for(int i=0;i<1000;i++)
				{
					in.inc();
				}
				
			}
			
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count value is "+ in.count);

	}

}
