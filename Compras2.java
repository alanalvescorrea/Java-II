import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Compras2 implements ActionListener {
	JFrame janela = new JFrame();
	JLabel label = new JLabel("Escolha Forma de Pagamento:");
	JButton botao = new JButton("OK");
	JComboBox combo = new JComboBox();

	double resultado = 0;

	public static void main(String args[]) {
		new Compras2();
	}

	public Compras2() {
		janela.setSize(240, 100);
		janela.setTitle("Exemplo de JComboBox");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new FlowLayout());
		janela.add(label);
		janela.add(combo);
		janela.add(botao);
		janela.setVisible(true);
		botao.addActionListener(this);
		combo.addItem("Dinheiro");
		combo.addItem("Cartao");
		combo.addItem("Cheque");

	}

	public void actionPerformed(ActionEvent e) {
		
		String numA = JOptionPane.showInputDialog(null,
				" Informe Valor Compra:");
		double a = Double.parseDouble(numA);

		switch (combo.getSelectedIndex()) {

		case 0:
			resultado = a;
			break;

		case 1:
			resultado = a * 1.05;
			break;

		case 2:
			resultado = a * 1.1;
			break;
		}

		JOptionPane.showMessageDialog(null, resultado);
	}
}
