package testaFunconarios;

public class Funcionarios {

	// atributos*/
	String nome = null;
	double salario = 0;
	int numeroDeDependentes = 0;
	int id = 0;
	int convenio = 0;

	public Funcionarios(String umNome, double umSalario,
			int umNumDeDependentes, int umaIdade, int umConvenio) {
		nome = umNome;
		salario = umSalario;
		numeroDeDependentes = umNumDeDependentes;
		id = umaIdade;
		convenio = umConvenio;

	}

	// metodos*/
	public void setSalario(double novoumSalario) {
		salario = novoumSalario;
	}

	public void setNome(String novoumNome) {
		nome = novoumNome;
	}
	public void setConvenio(int novoumConvenio ){
		convenio=novoumConvenio;
	}
	
	public void setId(int novoumaIdade) {
		id = novoumaIdade;
	}

	public void setnumeroDeDependentes(int novoumNumDeDependentes) {
		numeroDeDependentes = novoumNumDeDependentes;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public int getNumeroDeDependentes() {
		return numeroDeDependentes;
	}

	public int getId() {
		return id;
	}

	public int getConvenio() {
		return convenio;
	}

	public void exibeDados() {
		System.out.println(nome);
		System.out.println("salario funcionario é " + salario);
		System.out.println("Convenio funcionario é " + convenio);
		System.out.println("o Numero de dependentes do funcionário é " + numeroDeDependentes);
	}

	 {
		
		
	}

}