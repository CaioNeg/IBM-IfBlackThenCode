import java.util.Scanner;

public class TesteIfAninhado{

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		double n1, n2, avarage;

		System.out.print("Enter the n1: ");
		n1 = keyboard.nextDouble();

		System.out.print("Enter the n2: ");
		n2 = keyboard.nextDouble();

		avarage = (n1+n2)/2;

		System.out.println("Your Final Avarage is: "+avarage);

		if (avarage >= 9 ) {
			System.out.println("Concept A");
		}
		else if ( avarage >= 8 ){
			System.out.println("Concept B");
		}
		else if ( avarage >= 7 ){
			System.out.println("Cencept C");
		}
		else if ( avarage >= 6 ){
			System.out.println("Concept D");
		}
		else {
			System.out.println("Concept F");
		}

		keyboard.close();
	}
}