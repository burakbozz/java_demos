package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int toFind = 5;
		boolean isExist =false;
		
		for (int number : numbers) {
			if(number == toFind) {
				isExist = true;
				break;
			}
			
		}
		
		if(isExist) {
			System.out.println("number is exist");
		}else {
			System.out.println("number is not exist");
		}

	}

}
