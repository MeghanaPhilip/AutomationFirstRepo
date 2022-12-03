package Day6;

public class Fibonacci {
	public static void main(String[] args) {
		
		int a=0; int b=1;
		System.out.println("Fibonacci up to number 12");
		System.out.println(+a);
		System.out.println(+b);
        for(int i=2;i<=12;i++)
		{
        	int c=a+b;
        	System.out.println(+c);
        	a=b;
        	b=c;
			}
		}
		
}
