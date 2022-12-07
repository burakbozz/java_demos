package arrayDemo;

public class Main {

	public static void main(String[] args) {
		
		
		
		String[] students = new String[3];
		
		students[0] = "Burak";
		students[1] = "Onur";
		students[2] = "Ahmet";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]); 
		}
		System.out.println("---------------------------");
		for(String student : students) {
			System.out.println(student);
			
		}
		
	}

}
