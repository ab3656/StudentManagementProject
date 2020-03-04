package edu.mum.cs.cs415.demos.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.mum.cs.cs415.demos.studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {

	public static void main(String[] args) {
		Student[] student = {
				new Student(110001, "Dave", LocalDate.of(1951, 11, 18)),
				new Student(110002, "Anna", LocalDate.of(1990, 12, 7)),
				new Student(110003, "Erica", LocalDate.of(1974, 1, 31)),
				new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)),
				new Student(110005, "Bob", LocalDate.of(1990, 3, 5))};

		System.out.println("---------Print list of students in ascending order by name----------");
		printListOfStudents(student);
		List<Student> platinum = getListOfPlatinumAlumniStudents(student);
		Collections.sort(platinum, new Comparator<Student>(){
			  public int compare(Student p1, Student p2){
			    return -1*p1.getDateOfAdmission().compareTo(p2.getDateOfAdmission());
			  }
		});

		System.out.println("---------Print list of students admitted at least 30 years ago in descending order by date----------");
		
		for (Student stu : platinum) {
			System.out.println(stu.getStudentId());
			System.out.println(stu.getName());
			System.out.println(stu.getDateOfAdmission().toString());
		}
		
		int num[] = {5, 9, 7, 21, 20, 35, 70};
		System.out.println("---------Print Hello or World or HelloWorld----------");
		
		printHelloWorld(num);
		
		System.out.println("---------Print second largest number----------");
		
        findSecondBiggest(num); 
        
	}

	public static void printListOfStudents(Student[] students) {
		Arrays.sort(students, (a, b) -> a.getName().compareTo(b.getName()));
		for (Student student : students) {
			System.out.println(student.getStudentId());
			System.out.println(student.getName());
			System.out.println(student.getDateOfAdmission().toString());
		}
	}

	public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
		List<Student> platinum = new ArrayList<Student>();
		for (Student student : students) {
			if(Period.between(student.getDateOfAdmission(), LocalDate.now()).getYears() >= 30) {
				platinum.add(student);
			}
		}
		return platinum;

	}
	
	public static void printHelloWorld(int[] numbers) {
		for (int i : numbers) {			
			if(i%5 == 0 && i%7 == 0) {
				System.out.println("HelloWorld");
			}
			else {
				if(i%5 == 0) {
					System.out.println("Hello");
				}
				else if(i%7 == 0) {
					System.out.println("World");
				}
			}
		}
	}
	
	public static void findSecondBiggest(int[] numbers) {
		int i, first, second; 
	       
        if (numbers.length < 2) 
        { 
            System.out.print(" Invalid Input "); 
            return; 
        } 
       
        first = second = Integer.MIN_VALUE; 
        for (i = 0; i < numbers.length ; i++) 
        { 
            if (numbers[i] > first) 
            { 
                second = first; 
                first = numbers[i]; 
            } 
       
            else if (numbers[i] > second && numbers[i] != first) 
                second = numbers[i]; 
        } 
          
        if (second == Integer.MIN_VALUE) 
             System.out.print("There is no second largest"+ 
                                 " element\n"); 
        else
             System.out.print("The second largest element "+  second);
            
	}
	

}
