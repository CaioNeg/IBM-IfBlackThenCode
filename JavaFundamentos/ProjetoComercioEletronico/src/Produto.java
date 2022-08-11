
public class Produto {

	private int codigo;
	private String descricao;
	private double preco;
	
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;	
	}
	// Conceito de sobrecarga
	public Produto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = 0.00;
	}
	public Produto(int codigo) {
		this.codigo = codigo;
		this.descricao = "** não cadastrado";
		this.preco = 0.00;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	String getDescricao() {
		return descricao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	double getPreco() {
		return preco;
	}
	
	
	
	void mostrarAnuncio() {
		System.out.println("----- PRODUTO EM OFERTA ------");
		System.out.println(codigo + ":" + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}
	
	
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual / 100;
	}
	
	//Metodo retornando valores
	double simularDesconto(double percentual) {
		double precoSimulado;
		precoSimulado = preco - preco * percentual / 100;
		return precoSimulado;
	}
	

}
