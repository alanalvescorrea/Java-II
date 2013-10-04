import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class Estudos extends JFrame{public Estudos(){
super ("Tela de login usando GridBagLayout");

setLayout (new GridBagLayout()); //define o layout
((JComponent)getContentPane()).setBorder(new EmptyBorder (5,8,8,8)); //bordas


GridBagConstraints gbc = new GridBagConstraints (); //cria o GridBag
gbc.insets = new Insets(2,2,2,2); //controla o espaço entre os componentes
gbc.gridy=0; //adiciona componentes a janela(linha)
gbc.gridx=0; // coluna
gbc.gridwidth=2; //duas celulas nas linhas
gbc.anchor= GridBagConstraints.WEST; //alinha o label à esquerda

JLabel infoLabel = new JLabel ("Dados do Usuário: ");
infoLabel.setFont( new Font ("SanserFiel", Font.BOLD,14)); //aumentar fonte Label
infoLabel.setBorder(new EmptyBorder(0,0,5,0)); //adicionar espaço extra na parte inferior
add (infoLabel, gbc);
gbc.gridy=1;
gbc.gridx=0;
gbc.gridwidth=1;

JLabel usuarioLabel=new JLabel ("Usuario:");
add(usuarioLabel, gbc);
gbc.gridy=1;
gbc.gridx=1;
JTextField usuarioTxt = new JTextField (13);
add(usuarioTxt, gbc);
gbc.gridy=2;
gbc.gridx=0;

JLabel usuarioSenha=new JLabel ("Senha:");
add(usuarioSenha, gbc);
gbc.gridy=2;
gbc.gridx=1;
JPasswordField senhaTxt = new JPasswordField (13);
add(senhaTxt, gbc);
gbc.gridy=3;
gbc.gridx=1;
gbc.gridwidth=2;
gbc.anchor= GridBagConstraints.EAST;

JPanel botoesPanel = new JPanel();
botoesPanel.add(new JButton ("Cancelar"));
botoesPanel.add(new JButton ("Ok"));
add(botoesPanel, gbc);

pack(); //ajusta tamanho da tela
setVisible(true);

}

public static void main (String args[]){
Estudos app = new Estudos();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

}