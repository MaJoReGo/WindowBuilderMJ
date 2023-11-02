import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;
import java.awt.Color;

/*
 * Eventos del teclado.
 */

public class VentanaPrincipal extends JFrame implements ActionListener, KeyListener {
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;
    private JLabel lblNewLabel;

    public VentanaPrincipal() {
    	getContentPane().setBackground(new Color(255, 239, 213));
        setTitle("Programa Java");
        setSize(400, 246);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtTexto = new JTextField();
        txtTexto.setBounds(96, 49, 200, 30);
        txtTexto.addKeyListener(this);
        getContentPane().add(txtTexto);

        etiTexto = new JLabel();
        etiTexto.setForeground(new Color(184, 134, 11));
        etiTexto.setFont(new Font("Times New Roman", Font.BOLD, 12));
        etiTexto.setBounds(96, 90, 200, 30);
        getContentPane().add(etiTexto);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setForeground(new Color(184, 134, 11));
        btnVaciar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnVaciar.setBounds(150, 147, 100, 30);
        btnVaciar.addActionListener(this);
        getContentPane().add(btnVaciar);
        
        lblNewLabel = new JLabel("Ejercicio 3");
        lblNewLabel.setForeground(new Color(184, 134, 11));
        lblNewLabel.setBackground(new Color(218, 165, 32));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setBounds(162, 24, 80, 14);
        getContentPane().add(lblNewLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVaciar) {
            txtTexto.setText("");
            etiTexto.setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        etiTexto.setText(etiTexto.getText() + c);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // No necesitamos implementar este método, pero debemos proporcionar una definición.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No necesitamos implementar este método, pero debemos proporcionar una definición.
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
