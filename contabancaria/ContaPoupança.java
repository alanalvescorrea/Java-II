package contabancaria;

public class ContaPoupanša extends ContaBancaria{
	double taxaRendimento = 0.07;
	double rendimento;
	
	public ContaPoupanša(int n, double s, double tr) {
		super (n, s);
		taxaRendimento = tr;
	}
	public void calculaRendimento(double novosaldo) {
		saldo = saldo*taxaRendimento;
}
	public void exibeDados1() {
		System.out.println("Taxa Rendimento %: " + taxaRendimento);
		
		
}}