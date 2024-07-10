
public class IfelseIF {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		
		if(c<a)
		{
			System.out.println("1st block");
		}
		else if(c<b)
		{
			System.out.println("2nd block");
		}
		
		else if(b<a)
		{
			System.out.println("3rd block"); 
		}
		
		else if(b>c)
			
		{
			System.out.println("4th block"); 
		}
		
		else if(a<c)
			
		{
			System.out.println("5th block"); 
		}
		
		
		else
		{
			System.out.println("else block ");
		}

	}

}
