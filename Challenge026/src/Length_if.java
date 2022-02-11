import java.util.Scanner;
public class Length_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = input.nextLine();
		
		String first = word.substring(0, 1);
	
		int lenght = word.length();
		
		String rest = word.substring(1, lenght);
		
		if (!first.equals("a") && !first.equals("i") && !first.equals("o") && !first.equals("u")) {
			String newword = rest + first + "ay";
			System.out.print(newword.toLowerCase());
				}
		else {
			String newword = word + "way";
			System.out.print(newword.toLowerCase());
			}
		
		
	}

}
