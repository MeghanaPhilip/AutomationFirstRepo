
package Day5;

public class Overridingexample extends Overloadingexample{

	public void sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Child class Addition of 2 integer numbers:"+c);
	}
	
	
	public void diff(int a,int b,int c)
	{
		int h;
		h=a-b-c;
		System.out.println("Child class Difference of 3 integer numbers:"+h);
	}
	public static void main(String[] args) {
		Overridingexample ov= new Overridingexample();
		ov.sum(5,6);
		ov.diff(5, 1);;
		ov.diff(5, 1,2);
	}
}

