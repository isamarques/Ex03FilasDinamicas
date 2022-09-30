package controller;
import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class OperacaoController {

	public OperacaoController() {
		super();
	}

	public void ParqueController (Fila fila) throws Exception {
		
		while(!fila.isEmpty()) {
		Pessoa pessoa = (Pessoa) fila.remove();
		if (pessoa.idade < 16) {
			System.out.println("Nome da pessoa: " + pessoa.nome + "\nPROIBIDO ENTRADA \nMotivo: NÃO POSSUI IDADE.");
		}
		else if (pessoa.altura < 1.60) {
			System.out.println("Nome da pessoa: " + pessoa.nome + "\nPROIBIDO ENTRADA \nMotivo: NÃO POSSUI ALTURA.");

		}
		else if (pessoa.altura < 1.60 && pessoa.idade < 16) {
			System.out.println("Nome da pessoa: " + pessoa.nome + "\nPROIBIDO ENTRADA \nMotivo: NÃO POSSUI ALTURA E IDADE.");

		}
		else {
			System.out.println("Nome da pessoa: " + pessoa.nome + "\nPERMITIDO ENTRADA.");
		}
	}
}
}