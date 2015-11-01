
public class Calculator {
	public int add(int a,int b)
	{
		int c= a+b;
		return c;
	}

	public int substract(int a, int b)
	{
		int c;
		if (a>b)
		{
			c=a-b;
		}
		else
			c=b-a;

		return c;
	}
	public void display()
	{
		System.out.println("in display");
	}
	public static int multiply(int a, int b)
	{
		int c=a*b;
		return c;
	}
}
