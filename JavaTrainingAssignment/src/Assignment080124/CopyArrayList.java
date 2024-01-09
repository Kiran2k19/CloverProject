package Assignment080124;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class CopyArrayList {
	
	//Write a Java program to copy one array list into another.	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arrayList1=new ArrayList<>();  //CREATING THE OBJECT OF ARRAYLIST.
		arrayList1.add(10);                               //adding the element of the arraylist.
		arrayList1.add(20);
		arrayList1.add(5);
		
	//	ArrayList<Integer>arrayList2=new ArrayList<>(); 
		
		Set<Integer> set=new TreeSet<>();
		
		set.addAll(arrayList1);                   //copy the list to the set collection
		
		System.out.println(set);

	}

}

/* OUTPUT
 * 
 * [5, 10, 20]
 * 
 */
