import java.util.*;
public class Grades
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks (out of 100) : ");
		int marks = sc.nextInt();
		gradesOfStudents(marks);
		sc.close();
	}
	static void gradesOfStudents(int marks){
	    if(marks > 100){
	        System.out.println("Enter the marks below 100");
	    }
	    else if(marks <= 40){
	        System.out.println("Fail");
	    }
	    else if(marks>40 && marks<=50){
	        System.out.println("Grade: DD");
	    }
	    else if(marks>50 && marks<=60){
	        System.out.println("Grade: CD");
	    }
	    else if(marks>60 && marks<=70){
	        System.out.println("Grade: BC");
	    }
	    else if(marks>70 && marks<=80){
	        System.out.println("Grade: BB");
	    }
	    else if(marks>80 && marks<=90){
	        System.out.println("Grade: AB");
	    }
	    else if(marks>90 && marks<=100){
	        System.out.println("Grade: AA");
	    }
	    else{
	        System.out.println("Enter Correct Input");
	    }
	}
}
