public class Exercicio1 {

	public static void main(String[] args) {

		int vet[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int multi = 1;

		for (int i = 0; i < vet.length; i++) {

			if (vet[i] % 2 != 0) {

				multi = multi * vet[i];
				System.out.println(vet[i]);
			}
		}

		System.out.println("o produto é " + multi);
	}
}