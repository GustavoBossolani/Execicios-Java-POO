package br.com.gustavo.resource.exercicios.modelo;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return super.bonificacao() + 5000.0;
	}

	@Override
	public String toString() {
		return super.toString() + " Sal�rio: " + this.bonificacao() + " reais]";
	}
}
