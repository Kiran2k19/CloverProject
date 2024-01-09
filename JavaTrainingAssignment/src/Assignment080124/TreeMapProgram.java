package Assignment080124;
import java.util.Scanner;
import java.util.TreeMap;

//Write a Java program to search for a key in a Tree Map

	public class TreeMapProgram {
	    public static void main(String[] args) {
	       
	        TreeMap< Integer ,String> treeMap = new TreeMap<>();
	        
	        treeMap.put(101,"Jay");
	        treeMap.put(102,"Vijay");
	        treeMap.put(103,"Ajay");

	        
	        System.out.println("TreeMap: " + treeMap);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the key to search: ");
	        int keyToSearch = scanner.nextInt();

	        if (treeMap.containsKey(keyToSearch)) {
	            String value = treeMap.get(keyToSearch);
	            System.out.println("Key found! Value is  : "  + value);
	        } else {
	            System.out.println("Key not found in the TreeMap.");
	        }
	    }
	}
	
	/* output
	
TreeMap: {101=Jay, 102=Vijay, 103=Ajay}
Enter the key to search: 102
Key found! Value is  : Vijay

*/



