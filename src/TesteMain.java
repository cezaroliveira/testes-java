
public class TesteMain {

	public static void main(String[] args) {

		System.out.println("Início do método main");

		testarErroCompilacao();

		testarErroTempoExecucao();

		testarErroTempoExecucaoV2(args);

		System.out.println("Fim do método main");
	}

	private static void testarErroCompilacao() {

		// Definido como Integer, mas recebendo uma String, ou seja, tipos
		// incompatíveis.
//		Integer numero = "a";
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

	private static void testarErroTempoExecucaoV2(String[] args) {

		// Definido como null, ou seja, sem referência.
		String palavra = null;

		if (args != null) {
			palavra = "args foi informado";
		}

		/*
		 * Tentando acionar um método em uma referência que pode ser nula.
		 * 
		 * Não existe problema de compilação, porém a IDE tem ferramentas que podem
		 * indicar um possível problema em tempo de execução.
		 * 
		 * Será lançado NullPointerException em tempo de execução caso não seja
		 * inicializada corretamente.
		 */
		palavra.concat("outra palavra");
	}

}
