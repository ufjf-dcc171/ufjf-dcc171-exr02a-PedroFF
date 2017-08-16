package execicio2a;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaTexto extends JFrame {

    private JLabel etiqueta1 = new JLabel();
    private JLabel etiqueta2 = new JLabel();
    private JLabel etiqueta3 = new JLabel();
    private final JTextField texto;
    private final JTextField texto2;
    private double valor1;
    private double valor2;
    
    public JanelaTexto() throws HeadlessException {
        super("Janela Texto");
        etiqueta1 = new JLabel("Primeiro número: ");
        texto = new JTextField(10);
        add(etiqueta1);
        add(texto);

        etiqueta3 = new JLabel("Segundo número: ");
        texto2 = new JTextField(10);
        add(etiqueta3);
        add(texto2);
        etiqueta2 = new JLabel("");

        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(etiqueta2);
        
        texto.addActionListener(new Numero1Enter());
        texto2.addActionListener(new Numero2Enter());
    }

    private class Numero1Enter implements ActionListener {

        

        public Numero1Enter() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(texto.getText());
            texto2.requestFocus();
        }
    }
    private class Numero2Enter implements ActionListener {

        public Numero2Enter() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            valor2 = Double.parseDouble(texto2.getText());
            etiqueta2.setText("Resultado da soma: " + (valor1 + valor2));
        }
    }
}
