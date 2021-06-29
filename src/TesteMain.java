
public class TesteMain {

	public static void main(String[] args) {

		System.out.println("In�cio do m�todo main");

		testarErroCompilacao();

		testarErroTempoExecucao();

		testarErroTempoExecucaoV2(args);

		System.out.println("Fim do m�todo main");
	}

	private static void testarErroCompilacao() {

		// Definido como Integer, mas recebendo uma String, ou seja, tipos
		// incompat�veis.
//		Integer numero = "a";
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

	private static void testarErroTempoExecucaoV2(String[] args) {

		// Definido como null, ou seja, sem refer�ncia.
		String palavra = null;

		if (args != null) {
			palavra = "args foi informado";
		}

		/*
		 * Tentando acionar um m�todo em uma refer�ncia que pode ser nula.
		 * 
		 * N�o existe problema de compila��o, por�m a IDE tem ferramentas que podem
		 * indicar um poss�vel problema em tempo de execu��o.
		 * 
		 * Ser� lan�ado NullPointerException em tempo de execu��o caso n�o seja
		 * inicializada corretamente.
		 */
		palavra.concat("outra palavra");
	}

}
