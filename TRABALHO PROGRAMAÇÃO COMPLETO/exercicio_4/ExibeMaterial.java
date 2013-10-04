package exercicio_4;

public class ExibeMaterial {



	// atributos*/
	private int codigo= 2432;
	private String nome= "alan";
	private int saldo=250;
	
	

	
	public ExibeMaterial(int novoCodigo, String novoNome, int novoSaldo){  
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
		System.out.println("nome      saldo      codigo"); 
		System.out.println( ""       +saldo     +codigo); 
		
	
}

}
