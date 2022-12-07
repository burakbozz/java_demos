package perfectNumber;

public class Main {

	public static void main(String[] args) {
		
		// 6 --> 1,2,3
		// 28 ---> 1,2,3,4,14;
		
		int number = 28;
		int sum = 0;
		
		
		for (int i = 1; i < number; i++) {
			if(number%i == 0) {
				sum = i + sum;
			}
		
		}
		if(sum == number) {
			System.out.println("Your number is perferct");
		}else {
			System.out.println("Your number is not perfect");
			}

	}

}
