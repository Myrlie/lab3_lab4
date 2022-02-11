import java.util.Scanner;
public class MixMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter depth: ");
		double depth = input.nextDouble();
		
		double area = Math.PI * (Math.pow(radius, 2));
		double volume = area * depth;
		
		System.out.println(Math.round(volume*1000.0)/1000.0);

	}

}
