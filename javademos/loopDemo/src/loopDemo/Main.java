package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//for loop
		for (int i = 1; i <10; i+=2) {
			System.out.println(i);
		}
				       
		System.out.println("for loop is completed.");				
	
		//while
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("while loop is completed.");
		
		//do-while
		int j =1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("do-while is completed.");
}}
