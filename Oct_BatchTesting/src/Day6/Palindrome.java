package Day6;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
			
			System.out.println("Enter a number");
                    Scanner s=new Scanner(System.in);
                    int a =s.nextInt();
                    int t=0;
				while(a>0)
		       {
					t=a%10;		
				System.out.print(t);
				a=a/10;
			}
		}
}
