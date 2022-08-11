import java.util.Scanner;

public class EmpregadoTeste {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Empregado e1, e2;
		String nome1, nome2;
		double salario1, salario2;
		
		//entrada de dados pelo usuario
		System.out.println("Digite o nome do funcionario");
		nome1 = keyboard.nextLine();
		System.out.println("Digite o salario do funcionario");
		salario1 =Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Digite o nome do funcionario");
		nome2 = keyboard.nextLine();
		System.out.println("Digite o salario do funcionario");
		salario2 = Double.parseDouble(keyboard.nextLine());
		
		
		
		
		e1 = new Empregado(nome1, salario1);
		e2 = new Empregado(nome2, salario2);
		
		// antes do reajuste
		System.out.println("------ informações originais -----");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		e1.aumentarSalario(5.0);
		e2.aumentarSalario(7.0);
		
		System.out.println("------ Salario reajustado -----");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
	
		keyboard.close();
	}
		

}
