package introduction;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 0;
		firstNumber = 3;
		
		double secondNumber = 2.4;
		int sum = (int) (firstNumber + secondNumber);
		System.out.println(sum);
		
		char c = ' ';
		String firstName = "Petar";
		String lastName = "Petrovic";
		System.out.println("Student je: " + firstName + c + lastName);
		
		boolean bool = true;
		
		// USLOVI
		int a = 24;
		int b = 12;
		char operation = ' ';
		
		double result = -1;
		
		if (operation == '+') {
			result = a + b;
		}
		else if (operation == '-') {
			if (a > b) {
				result = a - b;
			}
			else {
				result = b - a;
			}
		}
		else if (operation == '*') {
			result = a * b;
		}
		else if (operation == '/') {
			result = a / b;
		}
		else {
			System.out.println("Nedozvoljena operacija!");
		}
		System.out.println("Rezultat je: " + result);
		
		// PETLJE
		int f = 5;
		int sumF = 1;
		while(f > 0) {
			sumF = sumF * f;
			f--;
		}
		System.out.println(sumF);
	}

}
