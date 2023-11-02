import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

/*
 * Pasar información entre componentes gráficos.
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JLabel lblNewLabel;

    public VentanaPrincipal() {
    	getContentPane().setBackground(new Color(255, 228, 196));
        setTitle("Programa Java");
        setSize(365, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtTexto = new JTextField();
        txtTexto.setBounds(70, 52, 200, 30);
        getContentPane().add(txtTexto);

        etiTexto1 = new JLabel();
        etiTexto1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        etiTexto1.setBounds(70, 93, 200, 30);
        getContentPane().add(etiTexto1);

        etiTexto2 = new JLabel();
        etiTexto2.setFont(new Font("Times New Roman", Font.BOLD, 12));
        etiTexto2.setBounds(70, 134, 200, 30);
        getContentPane().add(etiTexto2);

        JButton btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa1.setForeground(new Color(255, 165, 0));
        btnTraspasa1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnTraspasa1.setBounds(47, 175, 120, 30);
        btnTraspasa1.addActionListener(this);
        getContentPane().add(btnTraspasa1);

        JButton btnTraspasa2 = new JButton("Traspasa 2");
        btnTraspasa2.setForeground(new Color(255, 165, 0));
        btnTraspasa2.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnTraspasa2.setBounds(188, 175, 120, 30);
        btnTraspasa2.addActionListener(this);
        getContentPane().add(btnTraspasa2);
        
        lblNewLabel = new JLabel("Ejercicio 2");
        lblNewLabel.setForeground(new Color(255, 165, 0));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setBounds(139, 24, 76, 14);
        getContentPane().add(lblNewLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Traspasa 1")) {
            String texto = txtTexto.getText();
            etiTexto1.setText(texto);
        } else if (e.getActionCommand().equals("Traspasa 2")) {
            String texto = txtTexto.getText();
            etiTexto2.setText(texto);
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
