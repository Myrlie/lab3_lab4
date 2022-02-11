import java.util.Scanner;
public class Title_Func {
	public static String titleJava(String name) {
		char[] arr = name.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		return new String(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name in lowercase: ");
		String firstname = input.nextLine();
		firstname = titleJava(firstname);
		
		
		System.out.println("Enter your surname in lowercase: ");
		String surname = input.nextLine();
		surname = titleJava(surname);
		
		String name1 = firstname + " " + surname;
		
		
		System.out.println(name1);


	}

}
