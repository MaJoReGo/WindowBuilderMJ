import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal extends JFrame {
    private JLabel[] etiquetas;
    private JTextField txtNumero;
    private JButton btnBorrar;
    private StringBuilder textoAcumulado;

    public VentanaPrincipal() {
        setTitle("Etiquetas Numeros");
        setSize(605, 315);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(2, 5));

        etiquetas = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            etiquetas[i] = new JLabel(String.valueOf(i));
            etiquetas[i].setName("eti" + i);
            etiquetas[i].setHorizontalAlignment(SwingConstants.CENTER);
            etiquetas[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            etiquetas[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    String nombreEtiqueta = ((JLabel) e.getSource()).getName();
                    int numero = Integer.parseInt(nombreEtiqueta.substring(3));
                    textoAcumulado.append(numero);
                    txtNumero.setText(textoAcumulado.toString());
                }
            });
            getContentPane().add(etiquetas[i]);
        }

        txtNumero = new JTextField(10);
        txtNumero.setEditable(false);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setForeground(new Color(255, 105, 180));
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoAcumulado.setLength(0);
                txtNumero.setText("");
            }
        });

        JPanel panelInferior = new JPanel();
        panelInferior.setForeground(new Color(255, 105, 180));
        panelInferior.add(txtNumero);
        panelInferior.add(btnBorrar);

        getContentPane().add(panelInferior);

        textoAcumulado = new StringBuilder();
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
