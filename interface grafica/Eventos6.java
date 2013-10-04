
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Eventos6 implements ActionListener {

    JFrame janela = new JFrame();
    JPanel painel = new JPanel();
    JButton botao = new JButton("OK");
//criamos três radio buttons
    JRadioButton rb1 = new JRadioButton("Opção 1");
    JRadioButton rb2 = new JRadioButton("Opção 2");
    JRadioButton rb3 = new JRadioButton("Opção 3");
//criamos o grupo para os radio buttons
    ButtonGroup grupo = new ButtonGroup();

    public static void main(String args[]) {
        new Eventos6();
    }

    public Eventos6() {
        janela.setSize(240, 100);
        janela.setTitle("Exemplo de JRadioButton");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new GridLayout(2, 1));
        painel.setLayout(new GridLayout(1, 1));
        painel.add(rb1);
        painel.add(rb2);
        painel.add(rb3);
        janela.add(painel);
        janela.add(botao);
        janela.setVisible(true);
        botao.addActionListener(this);
//adicionamos os radio buttons ao grupo
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao) {
            String mensagem = "Nenhuma opção selecionada";
//verificamos qual radio button está selecionado
            if (rb1.isSelected()) {
                mensagem = "Opção 1 selecionada";
            } else if (rb2.isSelected()) {
                mensagem = "Opção 2 selecionada";
            } else if (rb3.isSelected()) {
                mensagem = "Opção 3 selecionada";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
