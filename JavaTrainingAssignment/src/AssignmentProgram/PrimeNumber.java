package AssignmentProgram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int count=1;
		
		System.out.println("pls Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
			
		}
		
		if(count==1)
		{
			System.out.println("Given number is  prime number ");
		}
		else
		{
			System.out.println("Given number is not prime number ");
		}
	}

}
