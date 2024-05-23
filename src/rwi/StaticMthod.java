package rwi;

public class StaticMthod   
{  
  

	StaticMthod()   
	{  
		System.out.println("constructor of the class.");  
	}  
  

	public void print()   
	{  
		System.out.println("Called print method.");  
	}  
  
	static  
	{  
		System.out.println("Called static block.");   
	}  
  

	public static void main(String args[])   
	{  
		StaticMthod s = new StaticMthod();  
		s.print(); 
		 
	}  
} 