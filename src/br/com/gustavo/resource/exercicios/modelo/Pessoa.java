package br.com.gustavo.resource.exercicios.modelo;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "[Nome: " + this.nome + " Idade: " + this.idade + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
}
