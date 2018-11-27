package br.com.gustavo.resource.exercicios.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.gustavo.resource.exercicios.modelo.Pessoa;

public class Exercicios1a3 {

	public static void main(String[] args) {

		// Exercicio 1
		
		System.out.println("----- Exercício 1 -----");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("João", 15));
		pessoas.add(new Pessoa("Leandro", 21));
		pessoas.add(new Pessoa("Paulo", 17));
		pessoas.add(new Pessoa("Jessica", 18));

		Pessoa pessoaMaisVelha = new Pessoa("", pessoas.get(0).getIdade());
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() > pessoaMaisVelha.getIdade()) {
				pessoaMaisVelha.setIdade(pessoa.getIdade());
				pessoaMaisVelha.setNome(pessoa.getNome());
			}
		}
		System.out.println("Ah pessoa mais velha é: " + pessoaMaisVelha);

		// Exercicio 2
		
		System.out.println("----- Exercício 2 -----");
		
		System.out.println("Atualmente a lista de pessoas possui: " + pessoas.size() + " pessoas;");
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoaDeMenor = pessoas.get(i);
			if (pessoaDeMenor.getIdade() < 18) {
				pessoas.remove(pessoaDeMenor);
				System.out.println("Pessoa " + pessoaDeMenor +  " removida.");
				System.out.println("Atualmente a lista de pessoas possui: " + pessoas.size() + " pessoas;");
			}
		}
		System.out.println("Pessoas que ainda estão na lista pois são de maior: " + pessoas);

		// Exercicio 3
		
		System.out.println("----- Exercício 3 -----");
		
		// System.out.println("Procurando a idade de Jessica");
		// Pessoa jessica = pessoas.get(1);
		// if(pessoas.contains(jessica)) {
		// System.out.println("Ah idade de Jessica é: " + jessica.getIdade());
		// }
		
		
		System.out.println("Procurando a idade de Jessica");
		pessoas.forEach(pessoa -> {
			if (pessoa.getNome().contains("Jessica")) {
				if (pessoas.contains(pessoa)) {
					System.out.println(pessoa.getNome() + " possui: " + pessoa.getIdade() + " anos");
				}
			}
		});
	}

}
