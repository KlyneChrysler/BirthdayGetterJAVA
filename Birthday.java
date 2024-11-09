import java.util.Scanner;

public class Birthday {
	public static void main ( String[] args ) {
		Scanner scan = new Scanner ( System.in );

		String name;
		String address;
		String birthMonth;
		int birthDay;
		int birthYear;
		int age;

		System.out.print("ENTER NAME: ");
		name = scan.nextLine();
		System.out.print("ENTER ADDRESS: ");
		address = scan.nextLine();
		System.out.print("ENTER BIRTH MONTH: ");
		birthMonth = scan.nextLine();
		System.out.print("ENTER BIRTH DAY: ");
		birthDay = scan.nextInt();
		System.out.print("ENTER BIRTH YEAR: ");
		birthYear = scan.nextInt();

		age = 2023 - birthYear;

		System.out.println("NAME: " + name);
		System.out.println("ADDRESS: " + address);
		System.out.println("BIRTHDAY: " + birthMonth + " " + birthDay + ", " + birthYear);
		System.out.println("AGE: " + age);
	}
}