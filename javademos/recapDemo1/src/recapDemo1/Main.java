package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;
		int greatestOne = number1;
		
		if(greatestOne < number2) {
			greatestOne = number2;
		}	
		if(greatestOne < number3) {
			greatestOne = number3;
		}
			
		System.out.println("The greatest one= "+greatestOne);
		
		
	}

}
