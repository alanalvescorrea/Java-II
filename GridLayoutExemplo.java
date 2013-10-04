import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;


public class GridLayoutExemplo {

	JFrame janela=new JFrame();							//instanciar e criar janela
	JPanel painel=new JPanel();							//instanciar e criar painel
	JLabel rotulo1=new JLabel("Fruta:");				//instanciar e criar rotulo com instru��o
	JLabel rotulo2=new JLabel("Bebida:");											
	
	DefaultListModel listModel = new DefaultListModel();
	JList lista= new JList (listModel);
	JComboBox combo=new JComboBox();
	
	JButton botao=new JButton("OK");					
	
	
public static void main(String[] args) {new GridLayoutExemplo();}
	
private GridLayoutExemplo() {	
	janela.setTitle("Janela Alan");                   		
	janela.setSize(350, 150);                       
	janela.setLocation(50, 50);                       		
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	janela.setVisible(true);
	
	painel.setLayout(new GridLayout(3,2,5,7));
		   //sintax: new GridLayout (linhas,colunas,espa�amento_horizontal, espa�amento_vertical

	painel.add(rotulo1);
	
	//ADICIONAR ITENS A LISTA
	listModel.addElement("Ma�a");
	listModel.addElement("Uva");
	listModel.addElement("Banana");
	listModel.addElement("Laranja");
	listModel.addElement("Caju");
	listModel.addElement("Ameixa");
	listModel.addElement("A�a�");
	
	painel.add(lista);
	painel.add(rotulo2);
	
	//ADICINAR ITENS AO COMBO
	combo.addItem ("�gua");
	combo.addItem ("Coca-Cola");
	combo.addItem ("Caf�");
	combo.addItem ("Ch�");
	combo.addItem ("Energetico");
	combo.addItem ("�gua T�nica");
	combo.addItem ("Suco");
	
	painel.add(combo);
	painel.add(botao);
	janela.add(painel);
	janela.setVisible(true);
		
}}