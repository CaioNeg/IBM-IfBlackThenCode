import java.util.Scanner;

public class BC1037{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		double value;
		value = keyboard.nextDouble();
		if (value >= 0.0 && value <= 25.0){
			System.out.println(" Break [0,25] ");
		}
		else if (value >= 25.0 && value <= 50.0){
			System.out.println(" Break (25,50] ");
		}
		else if (value >= 50.0 && value <= 75.0){
			System.out.println(" Break (50,75]) ");
		}
		else if (value >= 75.0 && value <= 100.0){
			System.out.println(" Break (75,100] ");
		}
		else{
			Systen.out.println("Out of Range");
		}





		keyboard.close();
	}
}