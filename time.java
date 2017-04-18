import java.util.Scanner;

public class time {
	private static Scanner	input	= new Scanner(System.in);
	private static int		time, year, days, day, hour, hours, min, mins, secs;

	public static void main(String args[]) {
		System.out.println("Please enter seconds: ");
		time = input.nextInt();

		time(time);

		input.close();
	}

	public static int time(int a) {
		secs = a % 60;

		min = (a - secs) / 60;
		mins = min % 60;

		hour = (min - mins) / 60;
		hours = hour % 24;

		day = (hour - hours) / 24;
		days = day % 365;

		year = (day - days) / 365;

		System.out.println(year + " year(s), " + days + " day(s), " + hours + " hour(s), " + mins + " minute(s) and " + secs + " second(s).");

		return 0;
	}
}
