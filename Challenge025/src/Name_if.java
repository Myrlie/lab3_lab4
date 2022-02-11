import java.util.Scanner;
public class Name_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String name = input.nextLine();
		
		int name1 = name.length();
		
		if (name1<5) {
			System.out.println("Enter your surname: ");
			String surname = input.next();
			name = name + surname;
			System.out.println(name.toUpperCase());
				}
		else {
			System.out.print(name.toLowerCase());
		}
		

	}

}
