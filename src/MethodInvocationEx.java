
public class MethodInvocationEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		int result = cal.add(2, 3);
		System.out.println(result);

		int result1 = cal.substract(5000, 1000);
		System.out.println(result1);

		int result2 = cal.add(20000, 15000);
		System.out.println(result2);

		cal.display();
	
		int result3 = Calculator.multiply(3, 2);
		System.out.println(result3);
		
	}
}
