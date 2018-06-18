package student_administration;
import java.util.Scanner;

public class student {
	private String first_name;
	private String last_name;
	private String year;
	private String student_id;
	private String courses="";
	private int tuition_balance;
	private int costofcourse=600;
	private int id=10;
	//prompt user to enter username and year
	public student() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the firstname:");
		first_name=scan.nextLine();
		System.out.print("Enter the lastname:");
		last_name=scan.nextLine();
		System.out.print("Enter the year:");
		year=scan.nextLine();
		
		setRandomid();
		//System.out.println(first_name+last_name+year+"  id="+student_id);
		enrolling();
		
	}
	
	//generate random id
	public void setRandomid() {
		id++;
		student_id=year+id;
		
	}
	
	//enrollment  in courses
	public void enrolling() {
		Scanner scan=new Scanner(System.in);
		String course_code="";
		System.out.print("Enter E to enroll in any course and Q for quit:");
		String enroll_input=scan.nextLine();
		do {
		if(enroll_input.equals("E")) {
			System.out.print("Enter course you want to enroll:");
			course_code=scan.nextLine();
			if(course_code.equals("Q")) {
				break;
			}
			courses=courses+"\n =>"+course_code;
			tuition_balance=tuition_balance+costofcourse;
		}
		
		}
		while(1>0);
		//System.out.println("courses you are enrolled:"+courses);
		//System.out.println("total balance after enrollment:"+tuition_balance);
		
	}
	
	//view balance in student
	public void checkbalance() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("total fee need to complete enrollment:"+tuition_balance);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		}
	
	//pay tuition
	public void payfee() {
	Scanner scan=new Scanner(System.in);

	checkbalance();
	System.out.print("Enter the amount you need to pay: ");
	int payamount=scan.nextInt();

	tuition_balance=tuition_balance-payamount;
	System.out.println("THANKS FOR PAYING $"+payamount);
	
	checkbalance();

	
	
		}
	

	//show status
	public String showinfo() {
		String st="Student name:"+first_name+" "+last_name+"\nYear enrolled:"+year+"\nStudent_id:"+student_id+"\nCOURSES ENROLLED:"+   courses +"\nBALANCE TO BE PAID:"+tuition_balance;
		return st;
	}
}

