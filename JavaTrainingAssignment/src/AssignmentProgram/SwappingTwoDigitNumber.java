package AssignmentProgram;

public class SwappingTwoDigitNumber {

	public static void main(String[] args)
	{
		int a=10, b=20;          //two number
	
		System.out.println("Before Swapping 2 digit number => ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		System.out.println("-------------------------------------------");
		
		a=a+b;               //swapping logic without using 3rd variable.
		b=a-b;
		a=a-b;
		System.out.println("After Swapping 2 digit number =>  ");
		System.out.println("A= "+a);         //print the value of A after swapping
		System.out.println("B= "+b);         // print the value of B after swapping
	
	}
	
}
