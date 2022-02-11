import java.util.Scanner;
public class RadiusMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		double area = Math.PI * (Math.pow(radius, 2));
		
		System.out.println(area);

	}

}
