package StudentRoster;

import java.util.ArrayList;

public class Roster {
	
	// create a dynamic array of objects and assign it to a variable.
	static ArrayList<Student> myRoster = new ArrayList<>();

	public static void main(String[] args) {
		// student data
		String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
	             "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
	             "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
	             "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
	             "5,Alex,Newman,alexnewman42@gmail.com,43,100,100,100"};
		
		// array of strings (students) into an array of Student objects (myRoster)
		convert(students);
		
		// method calls
		print_all();
		print_invalid_emails();
		for (Student b : myRoster) {
			print_average_grade(b.getStudentID());
		}
		remove("3");
		remove("3");
		
	} // end main
	
	// add student
	public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3) {
		int[] grades = {grade1, grade2, grade3};
		Student newStudent = new Student(studentID, firstname, lastname, emailaddress, age, grades);
		myRoster.add(newStudent);
	}
	
	// remove student
	public static void remove(String studentID){
		for (Student s : myRoster) {
			if (s.getStudentID().equals(studentID)) {
				myRoster.remove(s);
				return;
			} // end if
		} // end for
		System.out.println("Student ID: " + studentID + " could not be found.");
	}
	
	// print all
	public static void print_all() {
		for (int i=0; i < myRoster.size(); i++) {
			myRoster.get(i).print();
		}
		System.out.println();
	}

	public static void print_average_grade(String studentID) {
		for (Student b : myRoster){
			if (b.getStudentID()== studentID){
				double average = (b.getGrades()[0] + b.getGrades()[1] + b.getGrades()[2]) / 3;
				System.out.println("Student:\t" + studentID + "\tAverage Grade:\t" + average);
			} // end if
		} //end for
	}
	
	public static void print_invalid_emails() {
		for (Student b : myRoster) {
			if (!(b.getEmailAddress().contains("@") & b.getEmailAddress().contains(".")) || (b.getEmailAddress().contains(" "))) {
				System.out.println(b.getEmailAddress());
			} // end if
		} // end for loop
	}
	
	public static void convert(String[] oldArray) {
		for (String s : oldArray) {
			ArrayList<String> tempArray = new ArrayList<String>();
			int lastdelim = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ',') {
					tempArray.add(s.substring(lastdelim, i));
					lastdelim = i+1;
				} //end if
			} // end for
			tempArray.add(s.substring(lastdelim)); //add last item to array
			Roster.add(tempArray.get(0), tempArray.get(1), tempArray.get(2), tempArray.get(3), Integer.parseInt(tempArray.get(4)), Integer.parseInt(tempArray.get(5)), Integer.parseInt(tempArray.get(6)), Integer.parseInt(tempArray.get(7)));			
		}
	}
	
}
