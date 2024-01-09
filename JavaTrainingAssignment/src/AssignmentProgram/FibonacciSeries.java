package AssignmentProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0, b=1, c,n=20;                    //variable declaration
		
		System.out.print("Fibonacci Series : ");
		System.out.print(a+" "+b );
		
		for(int i=1;i<=n;i++)
		{
			c=a+b;                                 //logic
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}

	}

}
