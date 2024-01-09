package Assignment080124;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>  {
	
	public int compare(Student o1, Student o2) {
  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		
		//return s1.name.compareTo(s2.name);
		
		return s1.getName().compareTo(s2.getName());
		
		}
}

