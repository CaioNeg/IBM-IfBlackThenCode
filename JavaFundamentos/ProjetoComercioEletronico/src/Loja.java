
public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p, p2, p3;
		p = new Produto(123,"Computador",2500.00);
		p2 = new Produto(456,"Mouse", 70.00);
		p3 = new Produto(645,"Teclado", 120.00);

//		p.setCodigo(123);
//		p.setDescricao("Computador");
//		p.setPreco(2500.00);
//
//		p2.setCodigo(1234);
//		p2.setDescricao("Mouse");
//		p2.setPreco(70.00);
//
//		p3.setCodigo(12345);
//		p3.setDescricao("Teclado");
//		p3.setPreco(120.00);
//
//		p.mostrarAnuncio();
//		p2.mostrarAnuncio();
//		p3.mostrarAnuncio();

		System.out.println("***************************************");

		p.aplicarDesconto(10.0);
		// internamente na chamada do metodo há uma atribuição
		p.mostrarAnuncio();
		p2.setPreco(55.00);
		p3.setPreco(99.00);

		p2.mostrarAnuncio();
		p3.mostrarAnuncio();

		// Simulando descontos
		
		System.out.println("O preço do " + p.getDescricao() + " com mais 15% de desconto fica R$ " +p.simularDesconto(15) );
		p.mostrarAnuncio();

	}

}
