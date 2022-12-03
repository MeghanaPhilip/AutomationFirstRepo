package Day6;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
		
	int fact=1;
		System.out.println("Enter a number");
		 Scanner s=new Scanner(System.in);
         int a =s.nextInt();
        for(int i=1;i<=a;i++)
		{
        	
        	fact=fact*i;
			}
        System.out.println(+fact);
		}
}
