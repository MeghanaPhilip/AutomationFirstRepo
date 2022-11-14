package Day4;

public class Childmethod extends Parentmethod {

			public void method5() 
			{
			   super.method4(2,6);
			   this.method7(1);
			   this.method6(1,5,8);
			   this.method8(1,5);
				System.out.println("Child Default method");
			}
			public void method6(int d,int e, int f)
			{
				System.out.println("Child Three Parameterised method");
			}
			
			public void method7(int c)
			{
				
				System.out.println("Child One Parameterised method");
			}
			public void method8(int a,int b)
			{
				
				System.out.println("Child Two Parameterised method");
			}
			
			public static void main(String[] args)
			{
				
				Childmethod ch=new Childmethod();
				ch.method5();
				
			}
			
}




