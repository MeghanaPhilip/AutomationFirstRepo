package Day1;

public class Student {
int rollno;
int age;
public void display()
{
	System.out.println("Welcome ");
}
public void display1()
{
	System.out.println("Automation is easy");
}
public static void main(String[] args)
{
	Student s1=new Student();
	s1.display();
	s1.display1();
	s1.rollno=22;
	System.out.println("RollNo is:"+s1.rollno);
	s1.age=21;
	System.out.println("Äge is:"+s1.age);
}
}
