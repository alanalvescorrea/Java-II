import javax.swing.JOptionPane;

public class CalculaMedia {
	public static void main(String[] args) {
		String nome, n1, n2, nsub;
		double nota1, nota2, sub, media;

		nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		n1 = JOptionPane.showInputDialog("Digite a Nota Bimestre 1");
		nota1 = Double.parseDouble(n1);

		n2 = JOptionPane.showInputDialog("Digite Nota Bimestre 2");
		nota2 = Double.parseDouble(n2);

		
		media = (nota1 + nota2) / 2;
		
		
		
		
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Aluno " + nome + "\n"
					+ "A m�dia do aluno � " + media, "Aluno Aprovado",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno " + nome + "\n"
					+ "A media do aluno � " + media,
					"Dever� fazer Prova Substituta",
					JOptionPane.WARNING_MESSAGE);
			nsub = JOptionPane.showInputDialog("Digite a nota da Sub");

			sub = Double.parseDouble(nsub);
			media = (sub + nota2) / 2;
			
			
			
			if (sub >= 6) {
				JOptionPane.showMessageDialog(null, "Aluno" + nome + "\n"
						+ "A m�dia do aluno � " + nsub, "Aluno Aprovado",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno" + nome + "\n"
						+ "A media do aluno � " + nsub, "Reprovado",
						JOptionPane.WARNING_MESSAGE);
			}
		}
		System.exit(0);
	}
}