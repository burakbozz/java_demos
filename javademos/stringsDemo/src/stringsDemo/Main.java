package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String messeage = "Today weather is very good.";
		System.out.println(messeage);
		
		/*System.out.println("length of sentences :"+messeage.length());
		System.out.println("5. elements of sentences  : "+messeage.charAt(4));
		System.out.println(messeage.concat(" Hey!"));
		System.out.println(messeage.startsWith("a"));
		System.out.println(messeage.endsWith("."));
		char[] karakterler = new char[5];
		messeage.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(messeage.indexOf("day"));
		System.out.println(messeage.lastIndexOf('o'));*/
		
		String newMesseage = messeage.replace(' ', '-');
		System.out.println(newMesseage);
		System.out.println(messeage.substring(2,5));
		
		for(String word: messeage.split(" ")) {
			System.err.println(word);
		
		}
		
		System.out.println(messeage.toLowerCase());
		System.out.println(messeage.toUpperCase());
		System.out.println(messeage.trim());
	}

}
