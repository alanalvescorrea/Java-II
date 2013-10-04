package abril_15_2010;

public class CarroCorrida {

//ATRIBUTOS
	
	String nome= null;
	int va= 80;
	int vm= 200;
	
//METODOS
	public void acelerar (int novoVa){
		va= novoVa;
		va=va+10;
		
		if (va > vm){
			va = vm;
	}
	}
    public void exibeDados (){
    	System.out.println ("Velocidade atual é: " + va);
    	System.out.println ("Velocidade máxima é: " + vm);
    }

}
