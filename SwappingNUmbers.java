/******************************************************************************

im here to swap 2 numbers 
yay
*******************************************************************************/
public class SwappingNUmbers
{
	public static void main(String[] args) {
	
	double first = 2.33 , second = 3.7;
	
	System.out.println("Before swapping: ");
	System.out.println("First number: " + first);
	System.out.println("Second number: "+ second);
	
	double temporary = first;
	
	first = second;
	
	second = temporary;
	
	System.out.println("after swapping");
	System.out.println("First number: " + first);
	System.out.println("Second number: " + second);
	
		
	}
}
