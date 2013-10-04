package contabancaria;

public class TestaConta {

	
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria(9932, 34.45);
		ContaPoupança cp = new ContaPoupança (2345, 90.67, 0.09);
	
		
		
		c1.retira (100.00);
		c1.deposita(1000.56);
	
		
		c1.exibeDados ();
		cp.exibeDados1();
	}

	}


