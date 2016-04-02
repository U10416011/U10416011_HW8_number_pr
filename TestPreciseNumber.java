
import java.util.Scanner;

public class TestPreciseNumber {

	public static void main(String[] args) {
		String s,n1,n2;
		Scanner input = new Scanner(System.in);//create a scanner
		PreciseNumber PN = new PreciseNumber();
		System.out.println("What do you want to do?(Enter add or sub(for subtract) or mul(for multiply) or div(for divide))");
		s = input.nextLine();
		System.out.println("Enter the first number.");
		n1 = input.nextLine();
		System.out.println("Enter the second number.");
		n2 = input.nextLine();
		PN.Precise(s,n1,n2);//calculate numbers precisely
	}

}
