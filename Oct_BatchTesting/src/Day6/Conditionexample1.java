package Day6;

import java.util.Scanner;

public class Conditionexample1 {
	public static void main(String[] args) {
		
		System.out.println("Please enter value of marks ");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		if((marks>0)&&(marks<35))
		{
			System.out.println("Fail");
		}
		else if((marks>=35)&&(marks<65))
		{
			System.out.println("Pass");
		}
		else if((marks>=60)&&(marks<80))
		{
			System.out.println("Distinction");
		}
		
		else if((marks>=80)&&(marks<100))
		{
			System.out.println("Higher Distinction");
		}
		
		else
		{
			System.out.println("Please enter correct marks");
		}
	}
}


