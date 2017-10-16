package StudentRoster;

public class Student {
	//Declare class variables
	private String studentID;
	private String firstname;
	private String lastname;
	private String emailaddress;
	private int age;
	private int[] grades;
	
	//Constructor Method
	public Student(String studentID, String firstname, String lastname, String emailaddress, int age, int[] grades){
		this.setStudentID(studentID);
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setEmailAddress(emailaddress);
		this.setAge(age);
		this.setGrades(grades);
	}
	
	//Accessor Methods
	public String getStudentID(){
		return studentID;
	}

	public String getFirstName(){
		return firstname;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public String getEmailAddress(){
		return emailaddress;
	}
	
	public int getAge(){
		return age;
	}
	
	public int[] getGrades(){
		return grades;
	}
	
	//Mutator Methods
	public void setStudentID(String studentID){
		this.studentID = studentID;
	}
	
	public void setFirstName(String firstname){
		this.firstname = firstname;
	}
	
	public void setLastName(String lastname){
		this.lastname = lastname;
	}
	
	public void setEmailAddress(String emailaddress){
		this.emailaddress = emailaddress;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setGrades(int[] grades){
		this.grades = grades;
	}
	
	//Print Method
	public void print(){
		System.out.println("\tStudentID: " + getStudentID() +
				"\tFirst Name: " + getFirstName() +
				"\tLast Name: " + getLastName() +
				"\tEmail Address: " + getEmailAddress() +
				"\tAge: " +  getAge() +
				"\tGrades: {" + getGrades()[0] + ", " + getGrades()[1] + ", " + getGrades()[2] + "}");
	}//end print method

}// end class
