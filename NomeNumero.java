import java.util.Scanner;


public class NomeNumero {

	
	public static void main(String[] args) {
	
		
		
			Scanner s = new Scanner(System.in);

			int a = 0;
			int b = 0;
			int soma = 0;

			System.out.println("Digite um numero");
			a = s.nextInt();

			System.out.println("Digite outro numero");
			b = s.nextInt();

			soma = a + b;

			System.out.println("a soma é " + soma);


	}

}
