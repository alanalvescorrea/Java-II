import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
public class FlowLayoutExemplo{

	JFrame janela=new JFrame();					//instanciar e criar janela
	JPanel painel=new JPanel();					//instanciar e criar painel
	JLabel rotulo=new JLabel("Nome:");			//instanciar e criar rotulo com instrução
	JTextField texto=new JTextField(5);			//instanciar e criar texto de tamanho 5
	JButton botao=new JButton("OK");			//instanciar e criar botão
	
	
	
	public static void main(String[] args) {new FlowLayoutExemplo();}
	
	
	private FlowLayoutExemplo(){
		//FORMATAR JANELAS
		janela.setTitle("Janela Alan");                   		
		janela.setSize(350, 150);                         		
		janela.setLocation(50, 50);                       	
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//LAYOUT DO PAINEL
		painel.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
							  //sintaxe:FlowLayout.alinhamento,espaçamento_horizontal,espaçamento_vertical
		//ADICIONAR OBJETOS AO PAINEL
		painel.add(rotulo);
		painel.add(texto);
		painel.add(botao);
		
		//ADICIONAR PAINEL A JANELA
		janela.add(painel);
		
		//MOSTRAR JANELA
		janela.setVisible(true);
		
	}}
	
