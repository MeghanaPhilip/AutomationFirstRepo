package Day5;

public class Overloadingexample {

	public void sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition of 2 integer numbers:"+c);
	}
	
	public void sum(int a,int b,int c)
	{
		int f;
		f=a+b+c;
		System.out.println("Addition of 3 integer numbers:"+f);
	}
	public void diff(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Difference of 2 integer numbers:"+c);
	}
	public void diff(int a,int b,int c)
	{
		int h;
		h=a-b-c;
		System.out.println("Difference of 3 integer numbers:"+h);
	}
	public static void main(String[] args) {
		Overloadingexample o= new Overloadingexample();
		o.sum(5,6);
		o.diff(5, 1,8);;
		o.sum(2, 1,3);
	}
}

