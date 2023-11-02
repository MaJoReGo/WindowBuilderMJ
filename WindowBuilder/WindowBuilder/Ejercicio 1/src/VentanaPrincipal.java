import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

/*
 * Ocultar y Visualizar componentes gráficos.
 */

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField textNombre;
    private JTextField textCiudad;

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 240, 245));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Actividad 1");
        lblTitulo.setForeground(new Color(255, 105, 180));
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblTitulo.setBounds(194, 11, 74, 14);
        contentPane.add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(new Color(255, 105, 180));
        lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNombre.setBounds(33, 56, 47, 14);
        contentPane.add(lblNombre);

        JLabel lblCiudad = new JLabel("Ciudad:");
        lblCiudad.setForeground(new Color(255, 105, 180));
        lblCiudad.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblCiudad.setBounds(33, 153, 47, 14);
        contentPane.add(lblCiudad);

        textNombre = new JTextField();
        textNombre.setBounds(92, 53, 289, 20);
        contentPane.add(textNombre);
        textNombre.setColumns(10);

        textCiudad = new JTextField();
        textCiudad.setBounds(90, 150, 291, 20);
        contentPane.add(textCiudad);
        textCiudad.setColumns(10);

        JButton btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarNombre.setBackground(new Color(255, 255, 255));
        btnOcultarNombre.setForeground(new Color(255, 105, 180));
        btnOcultarNombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnOcultarNombre.setBounds(33, 99, 133, 23);
        btnOcultarNombre.addActionListener(this);
        contentPane.add(btnOcultarNombre);

        JButton btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnOcultarCiudad.setBackground(new Color(255, 255, 255));
        btnOcultarCiudad.setForeground(new Color(255, 105, 180));
        btnOcultarCiudad.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnOcultarCiudad.setBounds(33, 200, 133, 23);
        btnOcultarCiudad.addActionListener(this);
        contentPane.add(btnOcultarCiudad);

        JButton btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuNombre.setBackground(new Color(255, 255, 255));
        btnVisuNombre.setForeground(new Color(255, 105, 180));
        btnVisuNombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnVisuNombre.setBounds(230, 99, 162, 23);
        btnVisuNombre.addActionListener(this);
        contentPane.add(btnVisuNombre);

        JButton btnVisuCiudad = new JButton("Visualizar Ciudad");
        btnVisuCiudad.setBackground(new Color(255, 255, 255));
        btnVisuCiudad.setForeground(new Color(255, 105, 180));
        btnVisuCiudad.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnVisuCiudad.setBounds(230, 200, 162, 23);
        btnVisuCiudad.addActionListener(this);
        contentPane.add(btnVisuCiudad);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Ocultar Nombre")) {
            textNombre.setVisible(false);
        } else if (e.getActionCommand().equals("Visualizar Nombre")) {
            textNombre.setVisible(true);
        } else if (e.getActionCommand().equals("Ocultar Ciudad")) {
            textCiudad.setVisible(false);
        } else if (e.getActionCommand().equals("Visualizar Ciudad")) {
            textCiudad.setVisible(true);
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
