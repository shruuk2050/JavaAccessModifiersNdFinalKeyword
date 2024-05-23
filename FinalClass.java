final class B{}  
  
class FinalClass extends B
{  
  	void run()
	{
		System.out.println("running safely with 100kmph");
	}  
    
  	public static void main(String args[])
	{  
  		FinalClass honda= new FinalClass();  
  		honda.run();  
  	}  
}