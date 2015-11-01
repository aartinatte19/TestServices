
public class ConditionalStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20,b=10;
		
		if (a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
		
		int i=20, j=5, k=25;
		
		if (i>j && i>k)
		{
			System.out.println("i is greater");
		}
		else if (j>i && j>k)
		{
			System.out.println("j is greater");
		}
		else 
		{
			System.out.println("k is greater");
		}
		
		int monthString=10;
		
		if (monthString==1)
		{
		System.out.println("Jan");
		}
		else if (monthString==2)
		{
			System.out.println("Feb");
		}
	// Instead of this we can use switch 
		
		switch (monthString)
		{
		case 1:
			System.out.println("Jan");
			break;
			
		case 2:
			System.out.println("Feb");
			break;
			
		case 10:
			System.out.println("Oct");
			break;
		
		default:
			System.out.println("User has to enter from 1-12 ");
			break;
				
		}
		
	}

}
