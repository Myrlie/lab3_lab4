import java.util.Scanner;
public class Math_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("1) Square \n 2) Triangle");
		System.out.println();
		
		System.out.println("Enter a number: ");
		int menuselection = input.nextInt();
		
		if(menuselection == 1) {
			System.out.println("Enter the length of one side: ");
			int side = input.nextInt();
			int area = side * side;
			System.out.println("The area of your chosen shape is " + area);
		}
		else {
			if(menuselection ==2) {
				System.out.println("Enter the length of the base: ");
				int base = input.nextInt();
				System.out.println("Enter the height of the triangle: ");
				int height = input.nextInt();
				int area = (base * height)/2;
				System.out.println("The area of your chosen shape is " + area);
			}
			else {
				System.out.println("Incorrect option selected");
			}
		}

	}

}
