package Day4;

public class Program4 {

	public Program4()
	{
		this(2,3,5);
		System.out.println("Parent Default constructor");
		
	}
	public Program4(int a, int b, int c)
	{
		
		System.out.println("Parent Three Parameterised constructor");
		
	}
	
	public Program4(int d)
	{
		this();
		System.out.println("Parent One Parameterised constructor");
		
	}
	public Program4(int e,int f)
	{
		this(2);
		System.out.println("Parent two Parameterised Constructor");
	}
	
	
}
