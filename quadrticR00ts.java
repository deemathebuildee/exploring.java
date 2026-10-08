/******************************************************************************

im here today to find the roots  of the quadrtic equation.
i will choose random numbers and test them out. yay
a=2 b=4 c=24

*******************************************************************************/
public class quadrticR00ts
{
	public static void main(String[] args) {
		
		int a = 2, b = 4, c = 24;
		double root1, root2;
		
		
		double D = b * b -  4 * a * c ; // the discriminant
		
		if (D > 0) {
		 
		    root1 = (-b + Math.sqrt(D)) / (2 * a);  //The sqrt() method returns the square root of the specified number.
		    root2 = (-b - Math.sqrt(D)) / (2 * a);
		    
		    
		    System.out.format("root1 = %.2f and root2 = %.2f" , root1 , root2);
		}
		
		
		else if (D == 0) {
		
		root1 = root2 = -b / (2 * a);
		
		System.out.format("rott1 = root2 = %.2f;" , root1 );
	}
	
	
	   else { 
	       
	       double real = -b / (2 * a);
	       double i = Math.sqrt(-D) / (2 * a);
	       
	       System.out.format("root1 = %.2f+%.2fi", real, i);
	       System.out.format("\nroot2 = %.2f-%.2fi", real, i);

	   }

	}
	}
