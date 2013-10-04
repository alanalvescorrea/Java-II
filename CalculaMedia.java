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
					+ "A média do aluno é " + media, "Aluno Aprovado",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno " + nome + "\n"
					+ "A media do aluno é " + media,
					"Deverá fazer Prova Substituta",
					JOptionPane.WARNING_MESSAGE);
			nsub = JOptionPane.showInputDialog("Digite a nota da Sub");

			sub = Double.parseDouble(nsub);
			media = (sub + nota2) / 2;
			
			
			
			if (sub >= 6) {
				JOptionPane.showMessageDialog(null, "Aluno" + nome + "\n"
						+ "A média do aluno é " + nsub, "Aluno Aprovado",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno" + nome + "\n"
						+ "A media do aluno é " + nsub, "Reprovado",
						JOptionPane.WARNING_MESSAGE);
			}
		}
		System.exit(0);
	}
}