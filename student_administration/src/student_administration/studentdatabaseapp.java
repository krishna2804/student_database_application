package student_administration;
import java.util.Scanner;
public class studentdatabaseapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//take input from user about how many no of students
		/*student s1=new student();
		System.out.println("================================================================");
		s1.payfee();
		System.out.println("================================================================");
		String show_info=s1.showinfo();
		System.out.println("-------------------STUDENT DETAILS----------");
		System.out.println("*************************************************************");
		System.out.println(show_info);
		System.out.println("*************************************************************");
*/
		//take input from user about how many no of students

		System.out.print("Enter number students you want to enroll:");
		int noof_students=scan.nextInt();
		student [] students=new student[noof_students];
		for(int i=0;i<noof_students;i++) {
			//take input from user about how many no of students
			students[i]=new student();
			students[i].payfee();
			String show_info=students[i].showinfo();
			System.out.println("-------------------STUDENT-"+i+" DETAILS----------");
			System.out.println("*************************************************************");
			System.out.println(show_info);
			System.out.println("*************************************************************");
	
		}
		//create n number of new students
		
		/*student s2=new student();
		System.out.println("================================================================");
		s2.payfee();
		System.out.println("================================================================");
		String show_info=s2.showinfo();
		System.out.println("-------------------STUDENT DETAILS----------");
		System.out.println("*************************************************************");
		System.out.println(show_info);
		System.out.println("*************************************************************");


		student s3=new student();
		System.out.println("================================================================");
		s3.payfee();
		System.out.println("================================================================");
		String show_info=s3.showinfo();
		System.out.println("-------------------STUDENT DETAILS----------");
		System.out.println("*************************************************************");
		System.out.println(show_info);
		System.out.println("*************************************************************");
*/
	}

}

