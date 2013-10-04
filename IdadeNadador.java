package Aula2;

import java.util.Scanner;

public class IdadeNadador {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite idade nadador");
		int idade = s.nextInt();

		switch (idade) {

		case 5:
		case 6:
		case 7:
			System.out.print("Infantil A");
			break;
		case 8:
		case 9:
		case 10:
			System.out.print("Infantil B");
			break;
		case 11:
		case 12:
		case 13:
			System.out.print("Juvenil A");
		case 14:
		case 15:
		case 16:
			System.out.print("Infantil B");
		case 18:
		case 19:
		case 20:
			System.out.print("Adulto");
			break;

		}

		if (idade < 5) {
			System.out.println("Idade não autorizada");
		}
		if (idade > 20) {
			System.out.println("Adulto");
		}

	}
}
