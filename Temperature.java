import java.util.Scanner;
public class Temperature {
	public static void main(String[] arg) {
		Scanner in= new Scanner(System.in);

		System.out.print("Celsius:  ");
		double Celsius = in.nextInt();
		double Fahrenheit= Celsius*(9/5)+32;
		System.out.println(Celsius + " degrees Celsius is: " + Fahrenheit + " degrees Fahrenheit");
	}
}
