import java.util.Scanner;
public class ConvertTime {
	public static void main(String[] arg) {
		Scanner in= new Scanner(System.in);
		System.out.println("How many seconds?");
		int second= in.nextInt();
		int hour = second/3600;
		int min = (second%3600)/60;
		int seconds = (second%3600)%60;
		System.out.println(second + " seconds is " + hour + " hours, " +  min + " minutes, "+seconds+ " seconds");
	}
}
