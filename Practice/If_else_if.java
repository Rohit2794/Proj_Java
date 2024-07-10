package Practice;

public class If_else_if {
	
	

	public static void main(String[] args) {
		int a ,b,c,d;
		a=10;
		b=20;
		c=30;
		d=3;
		
		if(a<d)
		{System.out.println("a is lesser than d");}
		else if (b<d)
		{System.out.println("b is lesser than d");}
		else if (c<d)
		{System.out.println("c is lesser than d");}
		
		else if(d<=a)
		{System.out.println("d is lesser than a");}
		else
		{System.out.println("Not found ");}

	}

}
