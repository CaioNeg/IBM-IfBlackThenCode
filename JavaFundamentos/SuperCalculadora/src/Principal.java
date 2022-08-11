import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2, option;
		String line = "------------------------";
		
		
		System.out.println(line + "\nEnter the option you want: ");
		System.out.println(" 1 - Sum \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division \n 5 - Exit \n" + line);
		option = read.nextInt();
		
		while (option != 5) {
			System.out.println("First number: ");
			num1 = read.nextInt();
			System.out.println("Second number: ");
			num2 = read.nextInt();
			switch (option) {
			case 1:
				Sum calculateSum = new Sum();
				calculateSum.sum(num1, num2);
				break;

			case 2:
				Subtraction calculateSubtract = new Subtraction();
				calculateSubtract.subtract(num1, num2);
				break;

			case 3:
				Multiplication calculateMultiplication = new Multiplication();
				calculateMultiplication.multiplication(num1, num2);
				break;

			case 4:
				Division calculateDivision = new Division();
				calculateDivision.division(num1, num2);
				break;

			case 5:
				System.out.println("Shutting down...");
				break;
				
			default: 
				System.out.println("invalid option!");
				break;
			}
			System.out.println(line + "\nEnter the number of the desired arithmetic operation1: ");
			System.out.println(" 1 - Sum \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division \n 5 - Exit \n" + line);
			option = read.nextInt();
		}
		System.out.println("Shutting down...");
		read.close();
	}
}