package AssignmentProgram;
import java.util.Scanner;
public class StudentDemo {
	int rollNum;
	String studName;
	float mark1, mark2, mark3, totalMarks;
	Scanner sc=new Scanner(System.in);
	public void setStudDetails()
	{
		System.out.println("Enter the Student Roll number:   "); 
		rollNum=sc.nextInt();
		System.out.println("Enter the Student name:   ");       	
		studName=sc.next();
		System.out.println("Enter the Mark1:   ");
		mark1=sc.nextFloat();
		System.out.println("Enter the Mark2:   ");
		mark2=sc.nextFloat();
		System.out.println("Enter the Mark3:   ");
		mark3=sc.nextFloat();
	}
	public float calculateTotal()
	{
		totalMarks=mark1+mark2+mark3;
		return totalMarks;
	}
	public void displayStudDetails()
	{
		System.out.println();
		System.out.println("************Student Details**********");
		System.out.println();
		System.out.println("Student Roll Number:   "+rollNum);
		System.out.println("Student Name:    "+studName);
		System.out.println("Total Marks:    "+totalMarks);
	}
	public static void main(String[] args) {
		StudentDemo studentDemo=new StudentDemo();
		studentDemo.setStudDetails();
		studentDemo.calculateTotal();
		studentDemo.displayStudDetails();
		
		
	}
	
}
