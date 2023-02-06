package com.aw;

//Wap one class student name, subject 4, marks only non static variable use?

public class Testclass {

	public void studentData() {
		String name="Akshay";
		String subject="English";
		int marks=70;
		
		String name1="Prasad";
		String subject1="Marathi";
		int marks1=80;
		
		String name2="Rohan";
		String subject2="Hindi";
		int marks2=82;
		
		String name3="Wankhade";
		String subject3="Maths";
		int marks3=90;
		
		System.out.println("Student Name:- " + name + " Subject:- " + subject + " Marks:- " + marks);
		System.out.println("Student Name:- " + name1 + " Subject:- " + subject1 + " Marks:- " + marks1);
		System.out.println("Student Name:- " + name2 + " Subject:- " + subject2 + " Marks:- " + marks2);
		System.out.println("Student Name:- " + name3 + " Subject:- " + subject3 + " Marks:- " + marks3);
		
	}
	
	public static void main(String[] args) {
		
		Testclass obj=new Testclass();
		obj.studentData();
		
		
	}

}

/*public void studentNam() {
String n="AkshayParvi";
String n1="Prasad";
String n2="Rohan";
String n3="Wankhade";

System.out.println("Student Name:- " + n);
System.out.println("Student Name:- " + n1);
System.out.println("Student Name:- " + n2);
System.out.println("Student Name:- " + n3);
System.out.println("*********************************");

}

public void subject() {
String sub="English";
String sub1="Marathi";
String sub2="Hindi";
String sub3="Maths";

System.out.println("Subject English:- " + sub);
System.out.println("Subject Marathi:- " + sub1);
System.out.println("Subject Hindi:- " + sub2);
System.out.println("Subject Maths:- " + sub3);
}

public void marks() {
int engMarks=50;
int marMarks=65;
int hindiMarks=70;
int mathMarks=80;
System.out.println("*********************************");
System.out.println("English marks:- " + engMarks);
System.out.println("Marathi marks:- " + marMarks);
System.out.println("Hindi marks:- " + hindiMarks);
System.out.println("Marks marks:- " + mathMarks);

//obj.studentNam();
		//obj.subject();
		//obj.marks();
}
*/
