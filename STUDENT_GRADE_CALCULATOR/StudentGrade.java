package task;
import java.util.Scanner;
public class StudentGrade {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a valid number of subjects");
		int subjects=s.nextInt();
		if(subjects <=0) {
			System.err.println("Enter the valid number of subjects");
			return;
		}
		int totalMarks = 0;
		int maxMarks = 100;
		for(int i = 1 ; i<=subjects ; i++) {
			System.out.print("Enter the marks obtain in subject "+ i + " (out of 100).");
			int marks =s.nextInt();
			if(marks < 0 || marks > maxMarks) {
				System.out.println("Marks should be in the range of 0 to 100.");
				System.err.println("Enter a valid marks");
				i--;
			}else {
				totalMarks += marks;
			}
		}
		
		double averageP = (double) totalMarks /(subjects*maxMarks)*100;
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Average percentage : "+averageP+"%");
		String grade;
		
		if(averageP >= 90) {
			grade ="O";	
		}else if(averageP >= 80) {
			grade ="A";
		}else if(averageP >= 70) {
			grade ="B";
		}else if(averageP >= 60) {
			grade ="C";
		}else if(averageP >= 50) {
			grade ="D";
		}else {
			grade = "F";
		}
		System.out.println("Grade : "+grade);
	}
}











