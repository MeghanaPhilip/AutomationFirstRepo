package Day6;

import java.util.Scanner;


public class Conditionexample{
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a  value ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("Its an even number");
		}
		else
		{
			System.out.println("Its an odd number");
		}
		
		
		
	}
}
