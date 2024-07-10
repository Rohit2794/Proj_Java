package Practice;

public class Constructor {
	
	
	Constructor()
	{System.out.println("non parameter");}
	Constructor(int x)
	{System.out.println("Int");}
	Constructor(double d)
	{System.out.println("Double");}
	Constructor(long l)
	{System.out.println("long");}
	
	

	public static void main(String[] args) {
		new Constructor();
		new Constructor(2);
		new Constructor(12345668);

	}

}
