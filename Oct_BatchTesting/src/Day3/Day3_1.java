/**
 * 
 */
package Day3;

/**
 * @author megz
 *
 */
public class Day3_1 {

	public Day3_1()
	{
		this(1,2,3,4);
		System.out.println("Default Constructr");
	}
	
	public Day3_1(int a)
	{
	this();
	System.out.println("One parameterised Constructor");
}


	public Day3_1(int a,int b)
	{
	this(1,2,7);
	System.out.println("Two parameterised Constructor");
}
	
	public Day3_1(int a,int b,int c)
	{
	this(1);
	System.out.println("Three parameterised Constructor");
}
	public Day3_1(int a,int b,int c,int d)
	{
	
	System.out.println("Four parameterised Constructor");
}
	
	public static void main(String[] args) {
		Day3_1 u=new Day3_1(1,2);
	}
	}
	
