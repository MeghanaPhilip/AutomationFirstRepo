package Day6;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		
			System.out.println("Enter a number");
			 Scanner s=new Scanner(System.in);
	         int a =s.nextInt();
	        for(int i=1;i<=10;i++)
			{
	        	
	        	int b=a*i;
				System.out.println(+b);
			}
}
}