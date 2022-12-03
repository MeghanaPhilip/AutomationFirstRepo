package Day6;

import java.util.Scanner;

public class Conditionexample2 {
public static void main(String[] args) {
		
		System.out.println("Please enter a value ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Evenr");
			}
		else 
		{
			System.out.println("Odd");
		}
		}
		
		else
		{
			System.out.println("Please enter + number");
		}
		
		
}
}
