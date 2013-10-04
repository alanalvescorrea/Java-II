
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Compras implements ActionListener {
	JFrame janela = new JFrame();
	JPanel painel = new JPanel();
	JPanel painel2 = new JPanel();
	JLabel label1 = new JLabel("Digite o valor");
	JTextField texto1= new JTextField(10);
	
	JLabel label2 = new JLabel("Resultado");
	JLabel label3 = new JLabel("");
	JTextField texto2= new JTextField(10);
	JButton botao = new JButton("OK");
	// criamos três radio buttons
	JRadioButton rb1 = new JRadioButton("Dinheiro");
	JRadioButton rb2 = new JRadioButton("Cartão");
	JRadioButton rb3 = new JRadioButton("Cheque");
	// criamos o grupo para os radio buttons
	ButtonGroup grupo = new ButtonGroup();

	public static void main(String args[]) {
		new Compras();
	}

	public Compras() {
		janela.setSize(400, 200);
		janela.setTitle("Exercício 4");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new GridLayout(2, 2));
		painel.setLayout(new GridLayout(1, 1));
		painel2.setLayout(new GridLayout(3,3));
		painel.add(rb1);
		painel.add(rb2);
		painel.add(rb3);
		painel2.add(label1);
		painel2.add(texto1);
		
		painel2.add(label2);
		painel2.add(texto2);
		painel2.add(label3);
		painel2.add(botao);
		
		janela.add(painel);
		janela.add(painel2);
		
		janela.setVisible(true);
		botao.addActionListener(this);
		// adicionamos os radio buttons ao grupo
		grupo.add(rb1);
		grupo.add(rb2);
		grupo.add(rb3);
	}

	public void actionPerformed(ActionEvent e) {
		double numero=0;
		double resultado=0;
		//formata para aparecer as casas decimais e o símbolo R$
		DecimalFormat myFormat = new DecimalFormat("R$###,###.### ");  
		if (e.getSource() == botao) {
			String mensagem = "Nenhuma opção selecionada";
			// verificamos qual radio button está selecionado
			if (rb1.isSelected()) {
				resultado=0;
				mensagem = "Dinheiro não tem juro";
				// a variável numero recebe o valor que foi digitado na caixa de texto
				// Double.parseDouble(texto1.getText()) converte um String para double
				numero=Double.parseDouble(texto1.getText());
				resultado=numero;
				
			} else if (rb2.isSelected()) {
				resultado=0;
				mensagem = "Cartão aumento de 5%";
				// a variável numero recebe o valor que foi digitado na caixa de texto
				// Double.parseDouble(texto1.getText()) converte um String para double
				numero=Double.parseDouble(texto1.getText());
				//resultado recebe valor calculado
				resultado=numero*1.05;
				
			} else if (rb3.isSelected()) {
				resultado=0;
				mensagem = "Cheque aumento de 10%";
				// a variável numero recebe o valor que foi digitado na caixa de texto
				// Double.parseDouble(texto1.getText()) converte um String para double
				numero=Double.parseDouble(texto1.getText());
				//resultado recebe valor calculado
				resultado=numero*1.1;
			}
			JOptionPane.showMessageDialog(null, mensagem);
			// mostra o resultado calculada na caixa de texto resultado e 
			//String.valueOf(myFormat.format(resultado)) converte um double para um String e 
			//utiliza myFormat que foi criado no início desse método para definir as casas decimais	
			
			texto2.setText(String.valueOf(myFormat.format(resultado)));
		
		}
	}
}
