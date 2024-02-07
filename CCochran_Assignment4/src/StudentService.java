package casey.michael.v4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StudentService {
	
	
	public Student[] getStudentFromFile() {

	    Student[] compStudent = new Student[34];
	    Student[] statsStudent = new Student[33];
	    Student[] mathStudent = new Student[33];
	    Student[] students = new Student[101];

	    try (BufferedReader fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
	         BufferedWriter writer1 = new BufferedWriter(new FileWriter("course1.csv"));
	         BufferedWriter writer2 = new BufferedWriter(new FileWriter("course2.csv"));
	         BufferedWriter writer3 = new BufferedWriter(new FileWriter("course3.csv"))) {
	        int i = 0;
	        String line = null;

	        while ((line = fileReader.readLine()) != null) {
	            String[] studentData = line.split(",");
	            Student student = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
	            students[i] = student;
	            i++;
	        }

	        int compRoster = 0;
	        int statsRoster = 0;
	        int mathRoster = 0;

	        for (Student student : students) {
	            if (student.getCourse().contains("COMPSCI")) {
	                compStudent[compRoster] = student;
	                compRoster++;
	            }

	            if (student.getCourse().contains("STAT")) {
	                statsStudent[statsRoster] = student;
	                statsRoster++;
	            }

	            if (student.getCourse().contains("APMTH")) {
	                mathStudent[mathRoster] = student;
	                mathRoster++;
	            }
	        }

	        Arrays.sort(compStudent);
	        writer1.write("Student ID, Name, Course, Grade \n");
	        for (Student student : compStudent) {
	            writer1.write(student.getStudentID() + ",");
	            writer1.write(student.getName() + ",");
	            writer1.write(student.getCourse() + ",");
	            writer1.write(student.getGrade() + "\n");
	        }

	        Arrays.sort(statsStudent);
	        writer2.write("Student ID, Name, Course, Grade \n");
	        for (Student student : statsStudent) {
	            writer2.write(student.getStudentID() + ",");
	            writer2.write(student.getName() + ",");
	            writer2.write(student.getCourse() + ",");
	            writer2.write(student.getGrade() + "\n");
	        }

	        Arrays.sort(mathStudent);
	        writer3.write("Student ID, Name, Course, Grade \n");
	        for (Student student : mathStudent) {
	            writer3.write(student.getStudentID() + ",");
	            writer3.write(student.getName() + ",");
	            writer3.write(student.getCourse() + ",");
	            writer3.write(student.getGrade() + "\n");
	        }

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return students;
	}

}

//	public Student[] getStudentFromFile() {
//		
//		Student[] compStudent = new Student[34];
//		Student[] statsStudent = new Student[33];
//		Student[] mathStudent = new Student[33];
//		
//		try (BufferedReader fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
//				BufferedWriter writer1 = new BufferedWriter(new FileWriter("course1.csv"));
//				BufferedWriter writer2 = new BufferedWriter(new FileWriter("course2.csc"));
//				BufferedWriter writer3 = new BufferedWriter(new FileWriter("course3.csv"))) {
//			int i = 0;
//			String line = null; 
//			Student[] students = new Student[101];
//			
//			while ((line = fileReader.readLine()) != null) {
//				String[] studentData= line.split(",");
//				Student student =  new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
//				students[i] = student;
//				i++;
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		int compRoster = 0;
//		int statsRoster = 0;
//		int mathRoster = 0;
//	
//		for (Student student : student) {
//			if (student.getCourse().contains("COMPSCI")) {
//				compStudent[compRoster] = student;
//				compRoster++;
//				
//			}
//		
//			if (student.getCourse().contains("STAT")) {
//				statsStudent[statsRoster] = student;
//				statsRoster++;
//			}	
//		
//			if (student.getCourse().contains("APMTH")) {
//				mathStudent[mathRoster] = student;
//				mathRoster++;
//			}
//		}
//		
//		Arrays.sort(compStudent); 
//		writer1.write ("Student ID, Name, Course, Grade \n");
//		for (Student student : compStudent) {
//			writer1.write(student.getStudentID() + ",");
//			writer1.write(student.getName() + ",");
//			writer1.write(student.getCourse() + ",");
//			writer1.write(student.getGrade() + "\n");
//		}
//	
//		Arrays.sort(statsStudent);
//		writer2.write("Student ID, Name, Course, Grade \n");
//		for (Student student : statsStudent) {
//			writer2.write(student.getStudentID() + ",");
//			writer2.write(student.getName() + ",");
//			writer2.write(student.getCourse() + ",");
//			writer2.write(student.getGrade() + "\n");
//		}
//	
//		Arrays.sort(mathStudent);
//		writer3.write("Student ID, Name, Course, Grade \n");
//		for (Student student : mathStudent) {
//			writer3.write(student.getStudentID() + ",");
//			writer3.write(student.getName() + ",");
//			writer3.write(student.getCourse() + ",");
//			writer3.write(student.getGrade() + "\n");
//		}
//	
//	
//	}
//	
//	
//	return students; 
//
//}
