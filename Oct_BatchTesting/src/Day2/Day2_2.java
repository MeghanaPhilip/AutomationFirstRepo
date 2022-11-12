package Day2;

public class Day2_2 {

	public int sum(int a,int b)
	{
		int r=a+b;
		return r;
	}
	public int diff(int a,int b)
	{
		int r1=a-b;
		return r1;
	}
	public int mul(int a,int b)
	{
		int r2=a*b;
		return r2;
		
	}
	
	public int divide(int a,int b)
	{
		int r3=a/b;
		
		return r3;
	}
	
	public static void main(String[] args)
	{
		Day2_1 d=new Day2_1();
		int a=d.mul(10, 2);
		int b=d.sum(a,2);
		int c=d.diff(b, 2);
		int e=d.diff(c, 2);
		int f=d.divide(e, 2);
		System.out.println("The final result is:"+f);
	}
}
