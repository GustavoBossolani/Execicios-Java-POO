package br.com.gustavo.resource.exercicios.modelo;

public class Funcionario {
	
	private String nome;
	private int idade;
	private double salario;

	protected Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	protected double bonificacao() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "[Funcionário: " + this.nome + " Idade: " + this.idade;
	}
	
	public double getSalario() {
		return salario;
	}
}
