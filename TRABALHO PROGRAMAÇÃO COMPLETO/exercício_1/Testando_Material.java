package exerc�cio_1;

public class Testando_Material {

	
	public static void main(String[] args) {
		
		Material m1 = new Material(21, "Pedra", 98);
		Material m2 = new Material(23, "�gua", 34);
		
		
		
		
		m1.mudaNome ("Algod�o");
		m2.mudaNome ("�xido de Zinco");
		
		m1.mudaCodigo (001); 
		m2.mudaCodigo (002);
		
	
		
		m1.exibeDados ();
		m2.exibeDados ();
	}

}
