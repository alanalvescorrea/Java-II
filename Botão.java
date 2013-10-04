import javax.swing.JButton;
import javax.swing.JFrame;

public class Botão {
	JFrame janela = new JFrame();
	JButton botao= new JButton("OK");
	
	public static void main(String[] args) {new Botão();}

	
	
	private Botão(){
		janela.setTitle("Janela Alan");                   		//titulo
		janela.setSize(350, 150);                         		//largura e altura
		janela.add (botao);                       				//adicionar botao a janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//encerra a aplicação
		janela.setVisible(true);								//mostrar janela
	}

}
