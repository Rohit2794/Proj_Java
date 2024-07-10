
public class NestedIF_else {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		
		if(a<b)
		{
			
			if(a>15)
			{
				System.out.println("1st block");
			}
			
			else
			{
				System.out.println("1st else block");
				
			}
			
		}

		else
		{
			System.out.println("outside else block");
		}
		
	}

}
