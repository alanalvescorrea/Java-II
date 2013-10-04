import java.util.Scanner;
public class Turma {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float media []= new float [5];
		float mediag= 0;
		float soma =0;
		
		for (int i = 0; i < media.length; i++) {
			System.out.println("Digite media aluno");
			media [i]= s.nextFloat();
			soma = soma + media [i];
			 									}
		
		
			    mediag= soma / 5;
			
			    for (int i = 0; i < media.length; i++) {
			    if (media [i]> mediag)
				
				System.out.println ("a media do aluno é " + media [i]);
			    }
		        System.out.println ("a media geral é  " + mediag);    
	
	}}


