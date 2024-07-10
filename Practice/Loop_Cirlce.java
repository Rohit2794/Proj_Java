package Practice;
import java.math.*;

public class Loop_Cirlce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double d = Math.PI;
 double r =Math.random();
 double z = Math.pow(r, r);
  //double r1 = Math.sqrt(r);
  double area = d*z;
  
  for(int i =1 ; i<11;i++)
  {
	  System.out.println("Circle Area"+area);
  }
	}

}
