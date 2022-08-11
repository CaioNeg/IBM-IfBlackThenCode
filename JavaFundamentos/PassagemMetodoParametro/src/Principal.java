import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Criando as variaveis
		String Nome, Email;
		int Idade;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		Nome = keyboard.nextLine();
		System.out.println("Digite o seu email: ");
		Email = keyboard.nextLine();
		System.out.println("Entre com a sua idade: ");
		Idade = keyboard.nextInt();
		
		// chamando nossa classe
		
		MandaMensagem executar = new MandaMensagem();
		executar.mensagem(Nome, Email, Idade);
	}

}
