package contabancaria;

public class ContaBancaria {
	 String nome = "Alan";
	int numero = 2960;
	double saldo = 50.00;
	double saldoTotal;

	public ContaBancaria(int novoNumero, double novoSaldo) {
       
		numero = novoNumero;
		saldo = novoSaldo;

	}

	public void deposita(double novosaldo) {
		saldo = saldo+ novosaldo;

	}

	public void retira(double novoSaldo2) {
		saldo = saldo-novoSaldo2;
	}

	public double consultaSaldo() {
		return saldo;
	}

	public void exibeDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Numero Conta: " + numero);
	
		System.out.println("Saldo R$: " + saldo);
		
	}
}
