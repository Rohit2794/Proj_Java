
public class Method_Overloading {
	
	
	
	public static void add()
	{
		
		System.out.println("1");
		
	}

	public static void add(double a, int b)
	{
		
		System.out.println("2");
		
	}

	public static void add(char s, String R)
	{
		
		System.out.println("3");
		
	}
	
	public static void add(double a, double b)
	{
		
		System.out.println("4");
		
	}


	
	public static void main(String[] args) {
		add();
		add(12.4,12.65);
		add('R',"Rohit");

	}

}
