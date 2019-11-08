package trabalho8;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Banco {
	LocalTime horarioAbre = LocalTime.parse("08:00");
	LocalTime horarioFecha = LocalTime.parse("22:00");
	private String nome;
	ArrayList<ContaCorrente> listaContas = new ArrayList<ContaCorrente>();

	public Banco(String nome) {
		this.nome = nome;
	}

	public void criarConta(int numero, String senha, double saldo) {
		ContaCorrente a = new ContaCorrente(numero, senha, saldo);
		listaContas.add(a);
	}

	public void sacar(int numero, String senha, double valor)
			throws ExecaoContaInvalida, ExecaoHorarioInvalido, ExecaoSenhaInvalida, ExecaoSaldoInsuficiente {
		LocalTime now = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
		if (now.isAfter(horarioFecha) || now.isBefore(horarioAbre))
			throw new ExecaoHorarioInvalido();
		for (ContaCorrente i : listaContas) {
			if (i.getNumero() == numero) {
				i.retirar(valor, senha);
				break;
			} /*else
				throw new ExecaoContaInvalida(); */
		}
	}
}
