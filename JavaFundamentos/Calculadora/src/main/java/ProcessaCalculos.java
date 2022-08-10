import java.util.Scanner;

public class ProcessaCalculos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Entre com o valor desejado");
        valor1 = teclado.nextInt();

        System.out.println("Entre com o valor o segundo valor desejado");
        valor2 = teclado.nextInt();
        int resultado = valor1 + valor2;

        System.out.println("A soma dos valores é: " + resultado);

        teclado.close();
    }
}
