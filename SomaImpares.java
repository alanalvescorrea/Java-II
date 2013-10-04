package Aula2;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = 0;
		int soma = 0;
		float produto = 1;

		for (int i = 1; i < 5; i++) {
			System.out.println("Digite Valores de 1 a 30");
			a = s.nextInt();

			if (a % 2 != 0) {

				soma = soma + a;
			} else {

				produto = produto * a;
			}

		}
		System.out.println("O valor da soma com os numeros impares é " + soma);
		System.out.println("O valor do produto entre os numeros pares é "
				+ produto);
	}
}