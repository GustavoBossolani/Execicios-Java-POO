package br.com.gustavo.resource.exercicios.testes;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import br.com.gustavo.resource.exercicios.modelo.Funcionario;
import br.com.gustavo.resource.exercicios.modelo.Gerente;
import br.com.gustavo.resource.exercicios.modelo.Supervisor;
import br.com.gustavo.resource.exercicios.modelo.Vendedor;

public class Exercicio4Principal {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente("Gustavo Bosssolani", 21, 2000.0);
		Funcionario supervisor = new Supervisor("Ronaldinho", 30, 1500.0);
		Funcionario vendedor = new Vendedor("João", 19, 1000.0);
		
		Set<Funcionario> funcionarios = new TreeSet<>(Comparator.comparing(Funcionario :: getSalario));
		funcionarios.add(gerente);
		funcionarios.add(supervisor);
		funcionarios.add(vendedor);
		System.out.println(funcionarios);
	}

}
