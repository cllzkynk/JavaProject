package School;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentClass {@SuppressWarnings("unused")
	
	private String studentId;
	@SuppressWarnings("unused")
	private int gradeYear;
	private String firstName;
	private String lastName;
	@SuppressWarnings("unused")
	private String courseName;
	@SuppressWarnings("unused")
	private static int costOfCourse;
	@SuppressWarnings("unused")
	private int tuitionBalance;
	
	static int id=1000;
	Map<String, String> studentInfo = new HashMap<>();
	

	
	public void createNewStudent() {
		id++;
		StudentClass s = new StudentClass();
		System.out.println("New student created succesfully");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Name");
		s.firstName=scan.next();
		System.out.println("Please Enter Last Name");
		s.lastName=scan.next();
		System.out.println("Please Enter Grade Year");
		s.studentId=scan.next()	+ id;
		studentInfo.put(s.studentId, s.firstName + " "+ s.lastName);
		
		scan.close();
	}
	
	

	public void printStudents() {
		System.out.println(studentInfo);
	}
	public void getStudentInfo() {
		
		Scanner scan = new Scanner(System.in);
		String idOfStudent = "";
		String result = "";
		
		
		System.out.println("Enter student id to get information");
		System.out.println("Press 'X' to go to main menu");
			
			idOfStudent = scan.nextLine();		
			result = studentInfo.get(idOfStudent);	
			
			if(!idOfStudent.equals("X")) {
				System.out.println(result);
			}	
			scan.close();
	}
	
	public void removeStudent() {
		Scanner scan = new Scanner(System.in);
		String idOfStudent = "";
		String result = "";
		
		
			System.out.println("Enter student id to remove");
						
			idOfStudent = scan.nextLine();
			result = studentInfo.remove(idOfStudent);//remove() with key returns the value in a map
			
			
				System.out.println(result);
				System.out.println("Removed from the students list");
				scan.close();	
		
		}
}