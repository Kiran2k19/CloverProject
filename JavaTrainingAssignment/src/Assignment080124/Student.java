package Assignment080124;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Create Student class , create 3 objects of Student class. Add elements like id,name , age ,date of joining .
//Add all students in list and print all the elements of Student by iterating list

public class Student {
    private int id;
    String name;
    private int age;
    private String dateOfJoining;

   public Student(int id, String name, int age, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }
    
    

    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dateOfJoining=" + dateOfJoining + "]";
	}
	public static void main(String[] args) {
       
        ArrayList<Student> studentsList = new ArrayList<>();
       
        studentsList.add( new Student(101, "Jay", 24, "05/01/2024"));
        studentsList.add(new Student(102, "Vijay", 25, "08/10/2024"));
        studentsList.add(new Student(103, "Ajay", 26, "07/01/2024"));

        
        for (Student student : studentsList) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Date of Joining: " + student.getDateOfJoining());
            System.out.println();
        }

            System.out.println("Sorting by Name");  
            System.out.println("------------------");
            Collections.sort(studentsList,new NameComparator()); 
          //  System.out.println(studentsList);
            
            Iterator itr=studentsList.iterator();  
            while(itr.hasNext()){  
            Student st=(Student)itr.next();  
            System.out.println(st.id+" "+st.name+" "+st.age);  
             
        }
    }
}
/*
 *output
 
ID: 101
Name: Jay
Age: 24
Date of Joining: 05/01/2024

ID: 2
Name: Vijay
Age: 25
Date of Joining: 08/10/2024

ID: 3
Name: Ajay
Age: 26
Date of Joining: 07/01/2024


Sorting by Name

103 Ajay 26
101 Jay 24
102 Vijay 25



*/