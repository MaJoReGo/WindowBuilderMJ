import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Eventos del Mouse y posicionamiento.
 */

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JLabel etiNombre;
    private JButton btnEsquina;
    private JButton btnCentro;
    private JButton btnAgrandar;
    private JButton btnAchicar;
    private JLabel lblNewLabel;

    public VentanaPrincipal() {
    	getContentPane().setBackground(new Color(255, 245, 238));
        setTitle("Programa Java");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiNombre = new JLabel("            CONTENEDOR    ");
        etiNombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
        etiNombre.setForeground(new Color(250, 128, 114));
        etiNombre.setOpaque(true);
        etiNombre.setBackground(new Color(255, 218, 185));
        etiNombre.setBounds(10, 55, 163, 30);

        btnEsquina = new JButton("Esquina");
        btnEsquina.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnEsquina.setForeground(new Color(250, 128, 114));
        btnEsquina.setBounds(203, 268, 100, 30);
        btnEsquina.addActionListener(this);
        btnEsquina.addMouseListener(new BotonMouseAdapter(btnEsquina));

        btnCentro = new JButton("Centro");
        btnCentro.setForeground(new Color(250, 128, 114));
        btnCentro.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnCentro.setBounds(73, 268, 100, 30);
        btnCentro.addActionListener(this);
        btnCentro.addMouseListener(new BotonMouseAdapter(btnCentro));

        btnAgrandar = new JButton("Agrandar");
        btnAgrandar.setForeground(new Color(250, 128, 114));
        btnAgrandar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnAgrandar.setBounds(37, 309, 100, 30);
        btnAgrandar.addActionListener(this);
        btnAgrandar.addMouseListener(new BotonMouseAdapter(btnAgrandar));

        btnAchicar = new JButton("Achicar");
        btnAchicar.setForeground(new Color(250, 128, 114));
        btnAchicar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnAchicar.setBounds(255, 309, 100, 30);
        btnAchicar.addActionListener(this);
        btnAchicar.addMouseListener(new BotonMouseAdapter(btnAchicar));

        getContentPane().add(etiNombre);
        getContentPane().add(btnEsquina);
        getContentPane().add(btnCentro);
        getContentPane().add(btnAgrandar);
        getContentPane().add(btnAchicar);
        
        lblNewLabel = new JLabel("Ejercicio 6");
        lblNewLabel.setForeground(new Color(250, 128, 114));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblNewLabel.setBounds(163, 21, 76, 14);
        getContentPane().add(lblNewLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEsquina) {
            etiNombre.setLocation(10, 10);
        } else if (e.getSource() == btnCentro) {
            int x = (getWidth() - etiNombre.getWidth()) / 2;
            int y = (getHeight() - etiNombre.getHeight()) / 2;
            etiNombre.setLocation(x, y);
        } else if (e.getSource() == btnAgrandar) {
            Dimension newSize = new Dimension(etiNombre.getWidth() + 10, etiNombre.getHeight() + 10);
            etiNombre.setSize(newSize);
        } else if (e.getSource() == btnAchicar) {
            Dimension newSize = new Dimension(etiNombre.getWidth() - 10, etiNombre.getHeight() - 10);
            etiNombre.setSize(newSize);
        }
    }

    class BotonMouseAdapter extends MouseAdapter {
        private JButton boton;

        public BotonMouseAdapter(JButton boton) {
            this.boton = boton;
        }

        public void mouseEntered(MouseEvent e) {
            Dimension newSize = new Dimension(boton.getWidth() + 5, boton.getHeight() + 5);
            boton.setSize(newSize);
        }

        public void mouseExited(MouseEvent e) {
            Dimension newSize = new Dimension(boton.getWidth() - 5, boton.getHeight() - 5);
            boton.setSize(newSize);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}