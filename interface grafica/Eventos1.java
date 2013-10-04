	import java.awt.FlowLayout;  			    //importa layout
	import java.awt.event.ActionEvent;			//importa evento
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

		public class Eventos1 implements ActionListener{
		JFrame janela=new JFrame();
		JPanel painel=new JPanel();
		JLabel rotulo=new JLabel("Nome:");
		JTextField texto=new JTextField(5);
		JButton botao=new JButton("Ok");
		
		

	public static void main (String args[]){new Eventos1();}
		
		private Eventos1 (){
		janela.setTitle ("Janela Alan");
		janela.setSize(300,200);
		janela.setLocation(50,50);
		
		painel.setLayout(new FlowLayout(FlowLayout.CENTER,30,20)); //formato do layout
		painel.add(rotulo);
		painel.add(texto);
		painel.add(botao);
		
		janela.add(painel);
		janela.setVisible(true);
		
		botao.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==botao){
				JOptionPane.showMessageDialog(null, texto.getText());
			}
		}
		}

