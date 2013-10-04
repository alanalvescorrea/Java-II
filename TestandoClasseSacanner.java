import java.util.Scanner;

public class TestandoClasseSacanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String nome = " ";
		int a = 0;
		int b = 0;
		int soma = 0;

		System.out.println("Informe Nome usuário");
		nome = s.nextLine();

		System.out.println("Digite um numero");
		a = s.nextInt();

		System.out.println("Digite outro numero");
		b = s.nextInt();

		soma = a + b;

		System.out.println("o nome de usuário é " + nome);
		System.out.println("a soma é " + soma);

	}

}
