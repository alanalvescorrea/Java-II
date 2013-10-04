package testaFunconarios;

public class TestaFuncionarios {


public static void main(String[] args) {

	
	Funcionarios f4 = new Funcionarios("M. de Assis", 3.000, 1, 34, 0002); 
	Funcionarios f5 = new Funcionarios("Cecília Ize", 5.500, 3, 45, 0007);
	
	f4.setSalario (3.256);
	f5.setSalario(5.000);
	
	f4.setNome ("Alan");
	f5.setNome ("Aline");
	
	f4.setConvenio (0001);
	f5.setConvenio (00022);
	

	
	System.out.println (f4.getNome());
	
	f4.exibeDados ();
	f5.exibeDados ();
	
	
}

}
