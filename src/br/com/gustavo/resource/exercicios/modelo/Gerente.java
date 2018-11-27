package br.com.gustavo.resource.exercicios.modelo;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 10000.0;
	}

	@Override
	public String toString() {
		return super.toString() + " Salário: " + this.bonificacao() + " reais]";
	}
}
