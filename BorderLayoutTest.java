import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutTest extends JFrame implements ActionListener {
	JFrame janela=new JFrame();
	JButton botao1;
	JButton botao2;
	JButton botao3;
	JButton botao4;
	JButton botao5;

	public BorderLayoutTest() {
		janela.setSize(300,60);
		janela.setTitle("Janela Alan");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new GridLayout(1,2));
		botao1 = new JButton("Botão 1");
		botao2 = new JButton("Botão 2");
		botao3 = new JButton("Botão 3");
		botao4 = new JButton("Botão 4");
		botao5 = new JButton("Botão 5");
		// Como o padrao de um JFrame é o
		// BorderLayout, simplesmente adicionamos
		// os componentes na tela
		getContentPane().add(botao1, BorderLayout.NORTH);
		getContentPane().add(botao2, BorderLayout.CENTER);
		getContentPane().add(botao3, BorderLayout.WEST);
		getContentPane().add(botao4, BorderLayout.SOUTH);
		getContentPane().add(botao5, BorderLayout.EAST);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();
		setVisible(true);
		// adiciona o botão para ser ouvido pelo listener
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);
		botao4.addActionListener(this);
		botao5.addActionListener(this);

	}

	// método responsável pela ação do evento
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao1) {
			// se pressionado o botao2, mostramos uma mensagem
			JOptionPane.showMessageDialog(null, "Norte da janela");
			int resposta = JOptionPane.showConfirmDialog(null,
					"Deseja encerrar a aplicação?", "Confirmação",
					JOptionPane.OK_CANCEL_OPTION);
			if (resposta == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}
		if (e.getSource() == botao2) {
			// se pressionado o botao2, mostramos uma mensagem
			JOptionPane.showMessageDialog(null, "Centro da Janela");
			int resposta = JOptionPane.showConfirmDialog(null,
					"Deseja encerrar a aplicação?", "Confirmação",
					JOptionPane.OK_CANCEL_OPTION);
			if (resposta == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}
		if (e.getSource() == botao3) {
			// se pressionado o botao2, mostramos uma mensagem
			JOptionPane.showMessageDialog(null, "Este da janela");
			int resposta = JOptionPane.showConfirmDialog(null,
					"Deseja encerrar a aplicação?", "Confirmação",
					JOptionPane.OK_CANCEL_OPTION);
			if (resposta == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}
		if (e.getSource() == botao4) {
			// se pressionado o botao2, mostramos uma mensagem
			JOptionPane.showMessageDialog(null, "Sul da janela");
			int resposta = JOptionPane.showConfirmDialog(null,
					"Deseja encerrar a aplicação?", "Confirmação",
					JOptionPane.OK_CANCEL_OPTION);
			if (resposta == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}
		if (e.getSource() == botao5) {
			// se pressionado o botao2, mostramos uma mensagem
			JOptionPane.showMessageDialog(null, "Leste da janela");
			int resposta = JOptionPane.showConfirmDialog(null,
					"Deseja encerrar a aplicação?", "Confirmação",
					JOptionPane.OK_CANCEL_OPTION);
			if (resposta == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}
	}

	public static void main(String args[]) {
		new BorderLayoutTest();
	}
}
