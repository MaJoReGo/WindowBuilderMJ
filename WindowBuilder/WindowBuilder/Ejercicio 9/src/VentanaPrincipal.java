import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JTextField txtPalabra1, txtPalabra2;
    private JLabel etiTexto;

    public VentanaPrincipal() {
        setTitle("Concatenador de Palabras");
        setSize(300, 257);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblPalabra1 = new JLabel("Palabra 1:");
        lblPalabra1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblPalabra1.setBounds(46, 59, 61, 14);
        txtPalabra1 = new JTextField(15);
        txtPalabra1.setBounds(117, 56, 126, 20);
        JLabel lblPalabra2 = new JLabel("Palabra 2:");
        lblPalabra2.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblPalabra2.setBounds(46, 102, 61, 14);
        txtPalabra2 = new JTextField(15);
        txtPalabra2.setBounds(117, 99, 126, 20);

        JButton btnConcatena = new JButton("Concatenar");
        btnConcatena.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnConcatena.setBounds(91, 170, 116, 23);

        etiTexto = new JLabel("");
        etiTexto.setBounds(26, 145, 232, 14);
        getContentPane().setLayout(null);

        getContentPane().add(lblPalabra1);
        getContentPane().add(txtPalabra1);
        getContentPane().add(lblPalabra2);
        getContentPane().add(txtPalabra2);
        getContentPane().add(btnConcatena);
        getContentPane().add(etiTexto);
        
        JLabel lblNewLabel = new JLabel("Ejercicio 9");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setBounds(117, 21, 76, 14);
        getContentPane().add(lblNewLabel);

        btnConcatena.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                concatenarPalabras();
            }
        });
    }

    private void concatenarPalabras() {
        String palabra1 = txtPalabra1.getText();
        String palabra2 = txtPalabra2.getText();

        String resultado = palabra1 + palabra2;
        etiTexto.setText("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	VentanaPrincipal app = new VentanaPrincipal();
                app.setVisible(true);
            }
        });
    }
}
