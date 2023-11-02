import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaPrincipal extends JFrame {
    private JLabel etiPal1;
    private JLabel etiPal2;
    private JLabel etiPal3;
    private JLabel etiPal4;
    private JLabel etiOcultar;
    private JLabel lblEjercicio;

    public VentanaPrincipal() {
    	getContentPane().setBackground(new Color(250, 240, 230));
        setTitle("Programa Java");
        setSize(300, 271);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiPal1 = new JLabel("Palabra1");
        etiPal1.setForeground(new Color(188, 143, 143));
        etiPal1.setBounds(110, 59, 53, 20);
        getContentPane().add(etiPal1);

        etiPal2 = new JLabel("Palabra2");
        etiPal2.setForeground(new Color(218, 165, 32));
        etiPal2.setBounds(110, 90, 53, 20);
        getContentPane().add(etiPal2);

        etiPal3 = new JLabel("Palabra3");
        etiPal3.setForeground(new Color(210, 105, 30));
        etiPal3.setBounds(110, 121, 53, 20);
        getContentPane().add(etiPal3);

        etiPal4 = new JLabel("Palabra4");
        etiPal4.setForeground(new Color(255, 105, 180));
        etiPal4.setBounds(110, 152, 53, 20);
        getContentPane().add(etiPal4);

        etiOcultar = new JLabel("     Ocultar");
        etiOcultar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        etiOcultar.setBounds(101, 194, 75, 27);
        etiOcultar.setBackground(new Color(255, 165, 0));
        etiOcultar.setOpaque(true);
        etiOcultar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }
        });
        getContentPane().add(etiOcultar);
        
        lblEjercicio = new JLabel("Ejercicio 5");
        lblEjercicio.setForeground(new Color(255, 165, 0));
        lblEjercicio.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblEjercicio.setBounds(101, 28, 75, 20);
        getContentPane().add(lblEjercicio);
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