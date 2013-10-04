import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Eventos3 implements ActionListener{
	JFrame janela=new JFrame();
	JButton botao1=new JButton();
	JButton botao2=new JButton();
	
public static void main (String args[]){new Eventos3();}

public Eventos3(){
	janela.setSize(300,60);
	janela.setTitle("Janela Alan");
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setLayout(new GridLayout(1,2));
	
	botao1.setText("Cancelar");
	botao2.setText("Ok");
	botao1.addActionListener(this); //REGISTRAMOS OS BOTOES NO ACTIONLISTENER
	botao2.addActionListener(this);
	
	janela.add(botao1);
	janela.add(botao2);
	janela.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
	if (e.getSource()==botao1){	
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja Encerrar a aplicação?",
		 "confirmação",JOptionPane.OK_CANCEL_OPTION);
		
	if (resposta == JOptionPane.OK_OPTION){
		System.exit(0);
	}
	}	
	if (e.getSource()==botao2){
		String mensagem =JOptionPane.showInputDialog("Informe a mensagem");
		                 JOptionPane.showMessageDialog(null, mensagem);
	}
	}
	
}
	
	
	
	