import java.util.Scanner;
public class Math_round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number over 500: ");
		double num = input.nextDouble();
		
		double answer = Math.sqrt(num);
		
		answer = Math.round(answer*100.0)/100.0;
		System.out.println(answer);
	}

}
