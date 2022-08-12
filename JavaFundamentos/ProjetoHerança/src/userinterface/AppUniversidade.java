package userinterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Caio", "caio@caio.com", "987654321");
//		p.setNome("Caio");
//		p.setEmail("caio@caio.com");
//		p.setTelefone("987654321");
		
		System.out.println(p.exibirInfo());
		
		Estudante e = new Estudante("Jose", "jose@jose.com", "912345687",12345, "computacao");
//			e.setNome("Jose");
//			e.setEmail("jose@jose");
//			e.setTelefone("912345679");
//			e.setNumeroMatricula(12345);
//			e.setCurso("Computacao");
			
			System.out.println(e.exibirInfo());
		}
	
		

	}



