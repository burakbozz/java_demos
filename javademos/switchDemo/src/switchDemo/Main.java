package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Perferct: You pass");
			break;
		case 'B':
			System.out.println("Good: You pass");
			break;
		case 'C':
			System.out.println("Good: You pass");
			break;
		case 'D':
			System.out.println("Not bad: You pass");
			break;	
		case 'F':
			System.out.println("Bad: You fail");
			break;	
		default:
			System.out.println("invalid grade");
			
		}

	}

}
