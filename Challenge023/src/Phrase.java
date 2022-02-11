import java.util.Scanner;
public class Phrase {
//	public static String listJava(String name, int start, int end ) {
//		char[] arr = name.toCharArray();
//		arr = arr[start]: arr[end];
//		return new String(arr);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first line of a nursery rhyme: ");
		String phase = input.nextLine();
		
		int phase1 = phase.length();
		System.out.println("This has " + phase1 + " letters in it");
		
		System.out.println("Enter a starting number: ");
		int start = input.nextInt();
		
		System.out.println("Enter an end number: ");
		int end = input.nextInt();
		
		String part = phase.substring(start, end);
		
		System.out.println(part);
	}

}
