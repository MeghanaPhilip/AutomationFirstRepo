package Day6;

import java.util.Scanner;

public class Swap1 {
	public static void main(String[] args) {
		
		
		System.out.println("Enter 2 numbers");
                Scanner s=new Scanner(System.in);
                int a =s.nextInt();
                int t=s.nextInt();
                a=a+t;
                t=a-t;
                a=a-t;
                System.out.println("After swapping");
                System.out.println(+a);
                System.out.println(+t);
			
}
}
