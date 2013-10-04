package ComunicaClasses;

public class Funcionario {

	
	// atributos*/
	String nome = null;
	String cpf = null;
	String matricula = null;
	double salario = 0;
	int numeroDeDependentes = 0;
	
	
	
	public Funcionario(String umNome, int salario, int numDep){  
		   nome = umNome;
		   salario = 0;
		   numeroDeDependentes = numDep
	
	
	
	

	// metodos*/
	public void mudaSalario(double novoSalario) {
		salario = novoSalario;
	}

	public void mudaNome(String novoNome) {
		nome = novoNome;
	}

	public void mudaCpf(String novoCpf) {
		cpf = novoCpf;
	}
	public void mudaMatricula(String novoMatricula) {
		matricula = novoMatricula;
	}

	
	
	public void exibeDados() {
		System.out.println(nome);
		System.out.println("salario funcionario é " + salario);
		System.out.println("CPF funcionario é " + cpf);
		System.out.println("matricula funcionario é " + matricula);
	}

}