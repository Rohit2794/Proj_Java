package Practice;

import java.util.Scanner;


public class Vote {

	public static void main(String[] args) {
		int age = 18;
		char gender = 'M';
		
		int age2 = 25;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Name");
		
		String r1 = s1.next();
		//System.out.println(r1);
		
		if (age >=18 && gender == 'M' )
		{

			if(age2>=25)
			{System.out.println("Can vote");}
			else
			{System.out.println("Can`t vote");}
			
		}
			else
			{
				System.out.println("Not eligible for vote");
			}
		}

	}


