import java.util.Scanner;
public class Round_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number with lots of decimal places: ");
		double num = input.nextDouble();
		
		double answer = num*2;
		System.out.println(answer);
		
		answer = Math.round(answer*100.0)/100.0;
		System.out.println(answer);
	}

}
