import java.util.Scanner;

public class TesteIf{

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		double n1, n2, avarage;

		System.out.print("Enter the n1: ");
		n1 = keyboard.nextDouble();

		System.out.print("Enter the n2: ");
		n2 = keyboard.nextDouble();

		avarage = (n1+n2)/2;

		System.out.println("Your Final Avarage is: "+avarage);

		if (avarage >= 6 ) {
			System.out.println("Congratulations, you've been approved!!");
		}
		else{
			System.out.println("Oh no! You are disapproved.");
		}

		System.out.println("End of the Program.");

		keyboard.close();
	}
}