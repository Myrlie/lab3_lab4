import java.util.Scanner;
public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double num1 = input.nextDouble();
		
		System.out.println("Enter another number: ");
		double num2 = input.nextDouble();
		
		double ans1 = num1 / num2;
		int ans1_1 = (int)ans1;
		
		double ans2 = num1 % num2;
		int ans2_2 = (int)ans2;
		
		System.out.println(num1 + " divided by " + num2 +" is " + ans1_1 + " with " + ans2_2 +" remaining");
		

	}

}
