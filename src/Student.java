
public class Student {

	int rollno=0;
	int age=0;
	String name=null;
	static String schoolname="Selenium";

	public void play()
	{
		System.out.println("in play");
	}   
	public void read()
	{
		System.out.println("in read");
	}
	public static void main(String[] args) {

		Student s1= new Student();
		s1.rollno=1;

		Student s2= new Student();
		s2.rollno=2;

		Student s3= new Student();
		System.out.println("s3.rollno");
}
}