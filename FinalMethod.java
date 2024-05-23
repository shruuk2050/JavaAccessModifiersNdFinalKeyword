class Bike
{  
  	final void run()
	{
		System.out.println("running");
	}  
}  
     
class FinalMethod extends Bike
{  
   	void run()
	{
		System.out.println("running safely with 100kmph");
	} 
     
   	public static void main(String args[])
	{  
   		FinalMethod h = new FinalMethod();  
   		h.run();  
   	}  
}