package AssignmentsInLMS_week1;

import java.io.InputStream;
import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a num to get month.");
		int month = sc.nextInt();
		CalculateMonth cm = new CalculateMonth();
		cm.getMonth(month);
		
		int myInt = cm.getInt(sc.nextInt());
		System.out.println(myInt);
		
		//new CalculateMonth().getMonth(month);
		
	}

}
