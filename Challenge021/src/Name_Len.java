import java.util.Scanner;
public class Name_Len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname = input.nextLine();
		
		System.out.println("Enter your surname: ");
		String surname = input.nextLine();
		
		String name = firstname + " " + surname;
		
		int name1 = name.length();
		System.out.println(name1);

	}

}
