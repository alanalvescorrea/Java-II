package exerc�cio_1;

public class Material {

	
	
		// atributos*/
		private int codigo= 2432;
		private String nome= null;
		private int saldo=250;
		
		
	
		
		public Material(int novoCodigo, String novoNome, int novoSaldo){  
			   codigo = novoCodigo;
			   nome = novoNome;
			   saldo = novoSaldo;
		
		}
			   
		// metodos*/
			   
		
					   public void abastece (int nsaldo){
							saldo=nsaldo+10;
			   }
			   public void retira (int nsaldo){
							saldo=nsaldo-25;
					
			   }
			   
		public void mudaNome(String novoNome) {
			nome = novoNome;
		}

		public void mudaCodigo(int novoCodigo) {
			codigo = novoCodigo;
		}

		public void exibeDados() {
			System.out.println("os campos do material s�o " + nome); 
			System.out.println("os campos do material s�o " + saldo); 
			System.out.println("os campos do material s�o " + codigo);
		
	}

}
