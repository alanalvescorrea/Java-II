import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ComprasCorrigido implements ActionListener{

       JFrame janela=new JFrame();
       JPanel painel=new JPanel();
       JLabel rotulo=new JLabel("Valor Compra:");
       JTextField vc = new JTextField (13);
       JButton botao=new JButton("Calcular");
       JCheckBox chk1 = new JCheckBox("Dinheiro");
       JCheckBox chk2 = new JCheckBox("Cart�o");
       JCheckBox chk3 = new JCheckBox("Cheque");



public static void main (String args[]){new ComprasCorrigido();}

       private ComprasCorrigido (){
       janela.setTitle ("Janela Alan");
       janela.setSize(700,150);
       janela.setLocation(50,50);

       painel.setLayout(new FlowLayout(FlowLayout.CENTER,30,20)); //formato do layout
       painel.add(rotulo);
       painel.add(vc);
       painel.add(chk1);
       painel.add(chk2);
       painel.add(chk3);
       painel.add(botao);

       janela.add(painel);
       janela.setVisible(true);

       botao.addActionListener(this);

       }
       public void actionPerformed(ActionEvent e){
               double vf=0;

               if (e.getSource()==botao){
                       String mensagem = "";
                       //se chk1 selecionado acrescentamos o seu texto a mensagem
                       if (chk1.isSelected()){
                       vf = Double.parseDouble(vc.getText());
                       }
                       //se chk2 selecionado acrescentamos o seu texto a mensagem
                       if (chk2.isSelected()){
                       vf =(double) (Double.parseDouble(vc.getText())*1.05);
                       }
                       //se chk3 selecionado acrescentamos o seu texto a mensagem
                       if (chk3.isSelected()){
                    	   vf =(double) (Double.parseDouble(vc.getText()) *1.1);
                       }
                       JOptionPane.showMessageDialog(null, vf);
                       }
                       }
       }






