import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOriginal, c, d, u, rest;
        int newNumber;

        // Data input
        System.out.println("Enter a three digit whole number: ");
        numberOriginal = keyboard.nextInt();


        // Processing
        c = numberOriginal /100;      //ex: 234 /100 = 2
        rest = numberOriginal % 100;  //ex: 234 % 100 = 34
        d = rest /10;                 //ex: 34 / 10 = 3
        u = rest % 10;                //ex: 34 % 10 = 4

        newNumber = u * 100 + d * 10 +c;

        // Output
        System.out.println("The number new is: "+ newNumber);

        keyboard.close();
    }

}
