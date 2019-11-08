package trabalho8;

public class ContaCorrente {
	private int numero;
	private String senha;
	private double saldo;

	public ContaCorrente(int numero, String senha, double saldo) {
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
	}

	public void retirar(double valor, String senha) throws ExecaoSenhaInvalida, ExecaoSaldoInsuficiente {
		if(this.senha != senha) throw new ExecaoSenhaInvalida();
		if (saldo < valor)
			throw new ExecaoSaldoInsuficiente();
		saldo -= valor;

	}

	public int getNumero() {
		return numero;
	}
}
