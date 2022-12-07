package multiDimesionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		
		String[][] cities = new String[3][3];
		
		cities[0][0] = "istanbul";
		cities[0][1] = "Ankara";
		cities[0][2] = "Erzincan";
		cities[1][0] = "Adýyaman";
		cities[1][1] = "Antalya";
		cities[1][2] = "Ýzmir";
		cities[2][0] = "Karabük";
		cities[2][1] = "Bursa";
		cities[2][2] = "Kocaeli";
		
		for (int i = 0; i <=2; i++) {
			System.out.println("--------");
			for (int j = 0; j <=2; j++) {
				System.out.println(cities[i][j]);
			}
		}
		
		

	}

}
