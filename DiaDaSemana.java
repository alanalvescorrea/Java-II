package Aula2;

import java.util.Scanner;
public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = 1;
		while (a != 0) {
			
		
		System.out.println("Informe o novo valor :");
		a = s.nextInt();
		
		 switch (a) {
	        
	        case 1: System.out.println ("Segunda-Feira"); break;
	        case 2: System.out.println ("Terça-Feira"); break;
	        case 3: System.out.println ("Quarta-Feira"); break;
	        case 4: System.out.println ("Quinta-Feira"); break;
	        case 5: System.out.println ("Sexta-Feira"); break;
	        case 6: System.out.println ("Sábado"); break;
	        case 7: System.out.println ("Domingo"); break;
	        default : System.out.println ("Fim do teste"); break;
	}
	}
	}
}
		
		
