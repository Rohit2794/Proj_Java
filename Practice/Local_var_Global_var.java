	package Practice;

public class Local_var_Global_var {
	// int x = 30;
	 final static String s = "Rohit";
	 
	 char r ='M';
	static void show()
	{
		
		int x = 20;
		System.out.println(x);
		System.out.println(s);
		
		
	}
	void show2()
	{
		System.out.println(r);
	}

	public static void main(String[] args) {
		show();
		Local_var_Global_var l = new Local_var_Global_var();
		l.show2();

	}

}
