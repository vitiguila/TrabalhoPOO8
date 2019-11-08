package trabalho8;

public class Teste {
	public static void main(String[] args) {
		int i = 0;
		Banco a = new Banco("Caixa");
		do {
			try {
				a.criarConta(0, "1", 20000);
				a.criarConta(1, "2", 30000);
				a.criarConta(2, "3", 40000);
				a.criarConta(3, "4", 50000);
				a.criarConta(4, "5", 60000);

				a.sacar(0, "1", 100);
				a.sacar(0, "1", 100);
				a.sacar(0, "1", 100);
				a.sacar(1, "2", 100);
				a.sacar(2, "3", 100);
				a.sacar(3, "4", 100);
				a.sacar(3, "4", 100);
				a.sacar(4, "5", 100);
				a.sacar(2, "3", 100);
				a.sacar(2, "3", 100);
				a.sacar(1, "2", 100);
			} catch (ExecaoContaInvalida | ExecaoSenhaInvalida | ExecaoHorarioInvalido | ExecaoSaldoInsuficiente e) {
				System.out.println(e);
			} finally {
				i = 1;
			}

		} while (i != 1);
	}
}
