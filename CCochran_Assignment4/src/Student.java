package casey.michael.v4;

public class Student implements Comparable<Student>{

	private String studentID;
	private String name;
	private String course;
	private String grade;
	
	
	public Student (String studentID, String name, String course, String grade) {
		this.studentID = studentID;
		this.name = name; 
		this.course = course;
		this.grade = grade; 
		
		
		
	}


	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public int compareTo(Student that) {
		return that.grade.compareTo(this.grade);
	}
		
	}
