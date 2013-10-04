package Aula2;
import java.util.Scanner;
public class DiaSemanaCase {

	
		public static void main (String [ ] args)
		{
		Scanner s= new Scanner(System.in);

		System.out.println ("Digite um numero de 1 a 7");
		int a= s.nextInt();


		    switch (a) {
		        
		        case 1: System.out.print ("Segunda-Feira"); break;
		        case 2: System.out.print ("Terça-Feira"); break;
		        case 3: System.out.print ("Quarta-Feira"); break;
		        case 4: System.out.print ("Quinta-Feira"); break;
		        case 5: System.out.print ("Sexta-Feira"); break;
		        case 6: System.out.print ("Sábado"); break;
		        case 7: System.out.print ("Domingo"); break;
		        default : System.out.print ("Numero desconhecido"); break;
		    }
		}
		}
