
public class TesteMain {

	public static void main(String[] args) {

		testarErroCompilacao();

		testarErroTempoExecucao();
	}

	private static void testarErroCompilacao() {

		// Definido como Integer, mas recebendo uma String, ou seja, tipos incompatíveis.
		Integer numero = "a";
	}

	private static void testarErroTempoExecucao() {

		// Definido como null, ou seja, sem referência.
		String palavra = null;

		/*
		 * Tentando acionar um método em uma referência nula.
		 * 
		 * Não existe problema de compilação, porém a IDE tem ferramentas que podem
		 * indicar um possível problema em tempo de execução.
		 * 
		 * Será lançado NullPointerException em tempo de execução.
		 */
		palavra.concat("outra palavra");
	}

}
