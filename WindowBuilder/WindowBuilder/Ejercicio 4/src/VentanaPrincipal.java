import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

/*
 * Desactivar componentes Gráficos.
 */

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;

    public VentanaPrincipal() {
    	getContentPane().setBackground(new Color(255, 228, 225));
        setTitle("Programa Java");
        setSize(400, 285);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtNombre = new JTextField();
        txtNombre.setBounds(87, 70, 200, 30);
        getContentPane().add(txtNombre);

        txtCiudad = new JTextField();
        txtCiudad.setBounds(87, 123, 200, 30);
        getContentPane().add(txtCiudad);

        txtFrase = new JLabel();
        txtFrase.setForeground(new Color(255, 20, 147));
        txtFrase.setFont(new Font("Times New Roman", Font.BOLD, 12));
        txtFrase.setBounds(10, 164, 360, 30);
        getContentPane().add(txtFrase);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setForeground(new Color(255, 105, 180));
        btnAceptar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnAceptar.setBounds(20, 190, 100, 30);
        btnAceptar.addActionListener(this);
        getContentPane().add(btnAceptar);

        btnDesactivar = new JButton("Desactivar");
        btnDesactivar.setForeground(new Color(255, 105, 180));
        btnDesactivar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnDesactivar.setBounds(130, 190, 100, 30);
        btnDesactivar.addActionListener(this);
        getContentPane().add(btnDesactivar);

        btnActivar = new JButton("Activar");
        btnActivar.setForeground(new Color(255, 105, 180));
        btnActivar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnActivar.setBounds(240, 190, 100, 30);
        btnActivar.addActionListener(this);
        getContentPane().add(btnActivar);
        
        lblNewLabel = new JLabel("Ejercicio 4");
        lblNewLabel.setForeground(new Color(255, 105, 180));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setBounds(140, 33, 75, 14);
        getContentPane().add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("NOMBRE:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_1.setForeground(new Color(255, 105, 180));
        lblNewLabel_1.setBounds(20, 78, 57, 14);
        getContentPane().add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("CIUDAD:");
        lblNewLabel_2.setForeground(new Color(255, 105, 180));
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNewLabel_2.setBounds(20, 131, 57, 14);
        getContentPane().add(lblNewLabel_2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            String nombre = txtNombre.getText();
            String ciudad = txtCiudad.getText();
            String frase = "Usted se llama " + nombre + " y vive en " + ciudad + ".";
            txtFrase.setText(frase);
        } else if (e.getSource() == btnDesactivar) {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
        } else if (e.getSource() == btnActivar) {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
        }
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