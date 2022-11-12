/**
 * 
 */
package Day3;

/**
 * @author megz
 *
 */
public class Day3_2 {

	public void func1()
	{
		
		System.out.println("Default Method");
	}
	
	public void func2(int a)
	{
		
		System.out.println("One parameterised Method");
	}
	

	public void func3(int a,int b)
	{
		
		this.func4(1,2,3);
		this.func1();
		this.func5(1,2,3,4);
		this.func2(1);
		System.out.println("This is two parameterised method");
	}
	
	public void func4(int a,int b,int c)
	{
		System.out.println("This is three parameterised method");
	}

	public void func5(int a,int b,int c,int d)
	{ 
		System.out.println("This is four parameterised method");
	}
	public static void main(String[] args)
	{
		Day3_2 d=new Day3_2();
		d.func3(1, 2);
	}
}
	