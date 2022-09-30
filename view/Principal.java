package view;
import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		OperacaoController operacont = new OperacaoController();
		
		
		for (int i = 0; i < 30; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.nome = "Pessoa" + i;
			pessoa.idade = (int)((Math.random() * 31) + 10);
			pessoa.altura = (float)((Math.random() * 0.66) + 1.35);
			fila.insert(pessoa);
		}
		
		try {
			operacont.ParqueController(fila);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}