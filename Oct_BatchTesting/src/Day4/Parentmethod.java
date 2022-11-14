package Day4;

public class Parentmethod {


		public void method1()
		{
			this.method2(2,3,5);
			System.out.println("Parent Default method");
			
		}
		public void method2(int a, int b, int c)
		{
			
			System.out.println("Parent Three Parameterised method");
			
		}
		
		public void method3(int d)
		{
			this.method1();
			System.out.println("Parent One Parameterised method");
			
		}
		public void method4(int e,int f)
		{
			this.method3(2);
			System.out.println("Parent two Parameterised method");
		}
		
		
	}


