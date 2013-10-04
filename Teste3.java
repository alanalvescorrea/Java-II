package Teste1;
import java.awt.*;   
import java.awt.event.*;   
import javax.swing.*;   
  
  
import java.awt.Container;   
import java.awt.GridBagConstraints;   
import java.awt.GridBagLayout;   
  
import javax.swing.JButton;   
import javax.swing.JFrame;   
  
public class Teste3 extends JFrame {   
  
  public JTextField[] tf = new JTextField[55];   
  private javax.swing.JPanel jPanel1, jPanel2;   
  
  
  public Teste3() {   
    super("teste3");   
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);   
  
  
    jPanel1 = new javax.swing.JPanel();   
    jPanel2 = new javax.swing.JPanel();   
   jPanel1.setLayout(new GridLayout( tf.length, 1 ) );    
   for (int i = 0; i < tf.length ; i++)   
   {   
      tf[i] = new JTextField("dad "+i, 5);   
         tf[i].setBackground(Color.yellow);   
         tf[i].setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED, 4));  //RED , BLACK   
  
      jPanel1.add(tf[i]);   
   }   
  
  
/*  
    // a caixa de texto é o componente "decorado"    
    JTextArea txt = new JTextArea();    
        
    // "decora" a caixa de texto com barras de rolagem    
    Component comp = new JScrollPane(txt);    
        
    // adiciona o componente com barras de rolagem no form    
    getContentPane().add(comp);    
*/  
  
    Container c = this.getContentPane();   
  
    GridBagConstraints cons = new GridBagConstraints();   
    GridBagLayout layout = new GridBagLayout();   
    c.setLayout(layout);   
  
    cons.fill = GridBagConstraints.BOTH;   
    cons.gridy = 0;   
    cons.gridx = 0;   
    cons.gridwidth = 2;   
    c.add(new JButton("Esquerda"), cons);   
    cons.gridwidth = 1;   
    cons.gridx = 2;   
    c.add(new JButton("Direita"), cons);   
  
    cons.gridx = 0;   
    cons.gridy = 1;   
    c.add(new JButton("Esquerda"), cons);   
  
    cons.gridx = 1;   
    c.add(new JButton("Meio"), cons);   
  
    cons.gridx = 3;   
    c.add(new JButton("Direita"), cons);   
  
    cons.gridy = 2;   
    cons.gridx = 0;   
    cons.gridwidth = 2;   
    cons.gridwidth = 2;   
  
    Component comp = new JScrollPane(jPanel1);  // coloca scroll no jpanel   
//    c.add(jPanel1, cons);   
    c.add(comp, cons );   
  
  
    this.setSize(800, 800);   
  }   
  
  public static void main(String[] args) {   
    Teste3 exe = new Teste3();   
    exe.show();   
  }   
}  