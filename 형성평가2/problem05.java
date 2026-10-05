package practice02;

import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard?");
		double yard = sc.nextDouble();
		System.out.printf("%.1fyard = %.1f", yard, yard * 91.44);
	}

}
