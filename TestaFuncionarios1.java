package ComunicaClasses;

public class TestaFuncionarios {

	public static void main(String[] args) {

		
		Funcionario f1 = new Funcionario ();
		Funcionario f2 = new Funcionario ();
		
		
		f1.mudaSalario (3256);
		f2.mudaSalario(5000);
		
		f1.mudaNome ("Alan");
		f2.mudaNome ("Aline");
		
		f1.mudaMatricula ("001");
		f2.mudaMatricula ("002");
		
		f1.mudaCpf ("005.031.450-50");
		f2.mudaCpf ("005.053.012-40");
		
		
		
		f1.exibeDados ();
		f2.exibeDados ();
		
		
	}
	
}
