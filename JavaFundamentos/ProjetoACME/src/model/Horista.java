package model;

public class Horista extends Funcionario{
	private int numHora;
	private double valorHora;
	
	public Horista(int numRegistro, String nome, int numHora, double valorHora) {
		super(numRegistro, nome);
		this.numHora = numHora;
		this.valorHora = valorHora;
	}

	public int getNumHora() {
		return numHora;
	}

	public void setNumHora(int numHora) {
		this.numHora = numHora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return numHora * valorHora;
	}
	
	

}
