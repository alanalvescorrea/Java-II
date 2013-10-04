import javax.swing.JFrame;
public class Janela {
	JFrame janela=new JFrame();
	
	public static void main (String args[]){new Janela();}
	
	private Janela(){
	janela.setTitle("Janela Alan");                   		//titulo
	janela.setSize(350, 150);                         		//largura e altura
	janela.setLocation(50, 50);                       		//posição
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//encerra a aplicação
	janela.setVisible(true);								//mostrar janela
	}

}
