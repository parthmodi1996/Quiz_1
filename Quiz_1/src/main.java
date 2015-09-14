import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double td;
		double att;
		double comp;
		double yds;
		double Int;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the number of passing attempts made: ");
		att = user_input.nextDouble();
		System.out.println("Enter the number of touchdown passes: ");
		td = user_input.nextDouble();
		System.out.println("Enter the number of completions made: ");
		comp = user_input.nextDouble();
		System.out.println("Enter the number of yards passed made: ");
		yds = user_input.nextDouble();
		System.out.println("Enter the number of interceptions occured: ");
		Int = user_input.nextDouble();

		double a;
		double b;
		double c;
		double d;

		a = ((comp / att) - 0.3) * 5;
		b = ((yds / att) - 3) * 0.25;
		c = (td / att) * 20;
		d = 2.375 - ((Int / att) * 25);
		if (a < 0) {
			a = 0;
		}
		if (b < 0) {
			b = 0;
		}
		if (c < 0) {
			c = 0;
		}
		if (d < 0) {
			d = 0;
		}

		double pr;
		pr = (a + b + c + d) / 6 * 100;
		System.out.printf("The passer rating of the quater back is: %.1f", pr);

	}

}
