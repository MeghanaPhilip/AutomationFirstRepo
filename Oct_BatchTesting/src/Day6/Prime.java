package Day6;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
		
		System.out.println("Please enter a  value ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int res=0;
		for(int i=1;i<=a;i++)
		{
		
		if(a%i==0)
		{
			res++;
		}
		}
		if(res==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Compositenumber");
		}
}
}
