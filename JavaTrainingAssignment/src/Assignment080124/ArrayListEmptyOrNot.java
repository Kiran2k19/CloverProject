package Assignment080124;

import java.util.ArrayList;

public class ArrayListEmptyOrNot {

	//Write a Java program to test whether an array list is empty or not
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList1=new ArrayList<>();     //creating the object of ArrayList
		
		  arrayList1.add("Jay");                            //adding the element in the arrayList  
		  arrayList1.add("Vijay"); 
		  arrayList1.add("Ram");
		 
		
		if(arrayList1.isEmpty())                            //checking the list is empty or not    
		{
			System.out.println("Array List is empty");
		}
		else
		{
			System.out.println("Array List is not Empty");
		}

	}

}
//==================================================================================================
/* OUTPUT
 
  Array List is not Empty
  
  */
