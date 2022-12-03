package Day6;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		
		System.out.println("Enter a number");
                Scanner s=new Scanner(System.in);
                int a =s.nextInt();
                int w=a;
                int t=0;
                int res=0;
			while(a!=0)
	       {
				t=a%10;	
				res=res+(t*t*t);
			     a=a/10;
		   }
			if(res==w)
			System.out.print("Armstrong number");
			else
				System.out.print("Not an Armstrong number");	
	}
}
