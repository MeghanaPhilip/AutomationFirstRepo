package Day4;

import java.util.Scanner;

public class Scanner1 {

	
	public int sum(int a, int b) {
		int res=a+b;
		return res;
	}
	
	public int diff(int a, int  b) {
		int res1=a-b;
		return res1;
	}
	
	public int mul(int a, int b) {
		int res2=a*b;
		return res2;
	}
	public void div(int a,int b) {
		float res3=a/b;
		System.out.println("Final result is:"+res3);
	}
	
     public static void main(String args[])
     {
    	 Scanner s=new Scanner(System.in);
    	 Scanner1 s1=new Scanner1();
    	 System.out.println("Enter the values to solve the expression");
    	 int a=s.nextInt();
    	 int b=s.nextInt();
    	 int c=s.nextInt();
    	 int d=s.nextInt();
    	 int e=s.nextInt();
    	 int f=s.nextInt();
    	 int res=s1.sum(a, b);
    	 System.out.println("The result1:"+res);
		 int res2=s1.sum(res, c);
		 System.out.println("The result2:"+res2);
		 int res3=s1.diff(res2, d);
		 System.out.println("The result3:"+res3);
		 int res4=s1.mul(res3, e);
		 System.out.println("The result4:"+res4);
		 s1.div(res4, f);
		

	}
}
