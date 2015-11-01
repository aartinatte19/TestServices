package javaex;

public class LoopsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing the arguments" + args[0]);//0 is the index
		for(int i=0;i<10;i++)
		{
			System.out.println("selenium");
		}
		
		for (int i=0; i<10; i=i+1)
		{
			System.out.println("Value of i is --> "+ i + "Selenium");
		}

		int j = 0;
		while (j<10)
		{
		System.out.println("Selenium");
		j=j+1;
		}
		
		int k = 5;
		do{
			System.out.println("Selenium");
			k=k+1;
		}while (k>10);
		}
		
}


