package Practice;

public class Multiple_non_static {

	void show()
	{
		System.out.println("Non static method 1");
	}
	void show1()
	{
		System.out.println("Non static method 2");
	}
	void show2()
	{
		System.out.println("Non static method 3");
	}
	
	public static void main(String[] args) {
		Multiple_non_static n1= new Multiple_non_static();
		n1.show();
		n1.show1();
		n1.show2();

	}

}
