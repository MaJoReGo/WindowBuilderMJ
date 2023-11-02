import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Nota de estudiantes.
 */

public class VentanaPrincipal extends JFrame {
    private JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
    private JLabel etiNotaFinal, etiResultado;
    private JLabel lblTitulo;

    public VentanaPrincipal() {
        setTitle("Calculadora de Nota Final");
        setSize(403, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblPrimerTrimestre = new JLabel("Primer Trimestre:");
        lblPrimerTrimestre.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblPrimerTrimestre.setBounds(59, 43, 109, 14);
        txtPrimerTrimestre = new JTextField(10);
        txtPrimerTrimestre.setBounds(178, 40, 86, 20);
        JLabel lblSegundoTrimestre = new JLabel("Segundo Trimestre:");
        lblSegundoTrimestre.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblSegundoTrimestre.setBounds(59, 74, 109, 14);
        txtSegundoTrimestre = new JTextField(10);
        txtSegundoTrimestre.setBounds(178, 71, 86, 20);
        JLabel lblTercerTrimestre = new JLabel("Tercer Trimestre:");
        lblTercerTrimestre.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblTercerTrimestre.setBounds(59, 105, 109, 14);
        txtTercerTrimestre = new JTextField(10);
        txtTercerTrimestre.setBounds(178, 102, 86, 20);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnCalcular.setBounds(115, 145, 93, 23);

        etiNotaFinal = new JLabel("Nota Final:");
        etiNotaFinal.setFont(new Font("Times New Roman", Font.BOLD, 12));
        etiNotaFinal.setBounds(28, 179, 146, 14);
        etiResultado = new JLabel("Resultado:");
        etiResultado.setFont(new Font("Times New Roman", Font.BOLD, 12));
        etiResultado.setBounds(216, 179, 154, 14);
        getContentPane().setLayout(null);

        getContentPane().add(lblPrimerTrimestre);
        getContentPane().add(txtPrimerTrimestre);
        getContentPane().add(lblSegundoTrimestre);
        getContentPane().add(txtSegundoTrimestre);
        getContentPane().add(lblTercerTrimestre);
        getContentPane().add(txtTercerTrimestre);
        getContentPane().add(btnCalcular);
        getContentPane().add(etiNotaFinal);
        getContentPane().add(etiResultado);
        
        lblTitulo = new JLabel("Ejercicio 8");
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblTitulo.setBounds(168, 11, 71, 14);
        getContentPane().add(lblTitulo);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularNotaFinal();
            }
        });
    }

    private void calcularNotaFinal() {
        double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
        double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
        double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());

        double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;
        etiNotaFinal.setText("Nota Final: " + notaFinal);

        if (notaFinal < 5) {
            etiResultado.setText("Resultado: SUSPENSO");
            etiNotaFinal.setForeground(Color.RED);
            etiResultado.setForeground(Color.RED);
        } else {
            etiResultado.setText("Resultado: APROBADO");
            etiNotaFinal.setForeground(Color.BLACK);
            etiResultado.setForeground(Color.BLACK);
        }
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