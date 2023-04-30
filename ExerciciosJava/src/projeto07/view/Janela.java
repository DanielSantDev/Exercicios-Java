package projeto07.view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Janela {

    private JFrame form;
    private JTextField caixaDeTexto;
    private JLabel mensagemInformativa;
    private JButton botao;

    public Janela() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame();
        form.setBounds(600, 200, 500, 350);
        form.setTitle("Java com Swing");
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}
