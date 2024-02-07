package casey.michael.v4;

public class StudentApplication {

	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		studentService.getStudentFromFile();
		
		
	}
	
}
