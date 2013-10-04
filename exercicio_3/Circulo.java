package exercicio_3;

public class Circulo {

	// atributos*/
	private double raio = 0.1;
	public double ac = 0;
	
	public double ap = 0.0;

	public void mudaRaiorculo(double novoRaio) {
		raio = novoRaio;
	}

	public double calculaPerimetro(double raio) {
		
		ap = 2*3.14*raio;
		return ap;
	}

	public double  calculaCirculo(double raio) {
		ac = 3.14 * (raio * raio);
		return ac;
	}

	// metodos*/
	public void exibeDados() {
		System.out.println("o valor do raio é " + raio);

	}

}
