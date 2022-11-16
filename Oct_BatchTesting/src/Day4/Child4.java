package Day4;

public class Child4 extends Program4 {


		public Child4() 
		{
		    this(1,8);
			System.out.println("Child Default constructor");
		}
		public Child4(int d,int e, int f)
		{
			System.out.println("Child Three Parameterised constructor");
		}
		
		public Child4(int c)
		{
			this(3,5,8);
			System.out.println("Child One Parameterised constructor");
		}
		public Child4(int a,int b)
		{
			super(3,8);
			System.out.println("Child Two Parameterised constructor");
		}
		
		public static void main(String[] args)
		{
			
			Child4 ch=new Child4(5,7);
			
		}
		
	}


