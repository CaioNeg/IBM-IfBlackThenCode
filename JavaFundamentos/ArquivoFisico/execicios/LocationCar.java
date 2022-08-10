import java.util.Scanner;

public class LocationCar {

	public static void main(String[] args) {
		
		String[] cars = {"ix35", "Cayene", "SantaFé", "VeraCruz", "Onix", "Punto", "Strada", "HB20", "I30", "Uracan"};
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 1 to list vehicles - Enter 2 to choose vehicles - Enter 3 to end the program: ");
		
		int option = keyboard.nextInt();
		int number;

		switch(option) {
			case 1:

				System.out.println("Car list: ");

				for (int i = 0; i < 10; i++) {

					System.out.println(i + 1 + " - " + cars[i]);

				}

				break;

			case 2:

				System.out.print("Enter the option number of the chosen car: ");
				number = keyboard.nextInt();

				if (number <= 0 || number > 10) {

					System.out.println(" Invalid Number!");
				} else {
					for (int i = 0; i <= 10; i++) {

						if (number == i) {
							System.out.println("Chosen Car: " + cars[i - 1]);

						}

					}
				}

				break;

			case 3:

				System.out.println("Program Closed!");
				break;

			default:
				System.out.println("Please enter a valid option!");
		}

		keyboar.close();

	}

}