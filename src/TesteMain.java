
public class TesteMain {

	public static void main(String[] args) {

		testarErroCompilacao();

		testarErroTempoExecucao();
	}

	private static void testarErroCompilacao() {

		// Definido como Integer, mas recebendo uma String, ou seja, tipos incompat�veis.
		Integer numero = "a";
	}

	private static void testarErroTempoExecucao() {

		// Definido como null, ou seja, sem refer�ncia.
		String palavra = null;

		/*
		 * Tentando acionar um m�todo em uma refer�ncia nula.
		 * 
		 * N�o existe problema de compila��o, por�m a IDE tem ferramentas que podem
		 * indicar um poss�vel problema em tempo de execu��o.
		 * 
		 * Ser� lan�ado NullPointerException em tempo de execu��o.
		 */
		palavra.concat("outra palavra");
	}

}
