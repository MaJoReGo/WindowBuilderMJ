import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Manejo de Colores y propiedades de las etiquetas.
 */

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JLabel etiTexto;
    private JButton btnAzul;
    private JButton btnRojo;
    private JButton btnVerde;
    private JButton btnFondoAzul;
    private JButton btnFondoRojo;
    private JButton btnFondoVerde;
    private JButton btnTransparente;
    private JButton btnOpaca;

    public VentanaPrincipal() {
    	getContentPane().setBackground(new Color(255, 250, 250));
        setTitle("Programa Java");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        etiTexto = new JLabel("       Texto de ejemplo   ");
        etiTexto.setBounds(132, 97, 131, 30);
        etiTexto.setOpaque(true);
        etiTexto.setBackground(Color.WHITE);
        etiTexto.setForeground(Color.BLACK);

        btnAzul = new JButton("Azul");
        btnAzul.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnAzul.setForeground(new Color(65, 105, 225));
        btnAzul.setBounds(80, 178, 67, 23);
        btnAzul.addActionListener(this);

        btnRojo = new JButton("Rojo");
        btnRojo.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnRojo.setForeground(new Color(255, 0, 0));
        btnRojo.setBounds(157, 178, 72, 23);
        btnRojo.addActionListener(this);

        btnVerde = new JButton("Verde");
        btnVerde.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnVerde.setForeground(new Color(60, 179, 113));
        btnVerde.setBounds(239, 178, 67, 23);
        btnVerde.addActionListener(this);

        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnFondoAzul.setBackground(new Color(135, 206, 235));
        btnFondoAzul.setBounds(254, 249, 93, 23);
        btnFondoAzul.addActionListener(this);

        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnFondoRojo.setBackground(new Color(240, 128, 128));
        btnFondoRojo.setBounds(40, 249, 93, 23);
        btnFondoRojo.addActionListener(this);

        btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBackground(new Color(143, 188, 143));
        btnFondoVerde.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnFondoVerde.setBounds(143, 249, 101, 23);
        btnFondoVerde.addActionListener(this);

        btnTransparente = new JButton("Transparente");
        btnTransparente.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnTransparente.setBounds(80, 307, 108, 23);
        btnTransparente.addActionListener(this);

        btnOpaca = new JButton("Opaca");
        btnOpaca.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnOpaca.setBounds(216, 307, 72, 23);
        btnOpaca.addActionListener(this);
        getContentPane().setLayout(null);

        getContentPane().add(etiTexto);
        getContentPane().add(btnAzul);
        getContentPane().add(btnRojo);
        getContentPane().add(btnVerde);
        getContentPane().add(btnFondoAzul);
        getContentPane().add(btnFondoRojo);
        getContentPane().add(btnFondoVerde);
        getContentPane().add(btnTransparente);
        getContentPane().add(btnOpaca);
        
        JLabel lblNewLabel = new JLabel("Ejercicio 7");
        lblNewLabel.setForeground(new Color(255, 192, 203));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setBounds(152, 32, 85, 14);
        getContentPane().add(lblNewLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(Color.BLUE);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(Color.RED);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(Color.GREEN);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setForeground(new Color(0, 0, 0, 0)); // Color transparente
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setForeground(Color.BLACK); // Color no transparente
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}