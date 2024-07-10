package Practice;

public class Static_Method {
	
	 static void method()
	{
		System.out.println("Static Method");
	}

	 static void method2(boolean b)
		{
			System.out.println("Static Method2 ");
		}
	 static void method3(char c)
		{
			System.out.println("Static Method 3");
		}
	public static void main(String[] args) {
		
  method();
  method2(true);

  method3('x');

	}

}
