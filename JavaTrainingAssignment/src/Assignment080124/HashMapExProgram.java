package Assignment080124;

import java.util.HashMap;

//Write a program to add elements to the HashMap given the key and value data type is String

public class HashMapExProgram {

	public static void main(String[] args) {
		
		HashMap<String,String> hashMap=new HashMap<>();
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		
		System.out.println(hashMap);

	}

}

/* output
 
{key1=value1, key2=value2, key3=value3}

*/