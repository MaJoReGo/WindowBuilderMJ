import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {
	
	private JPanel panelPrincipal;
	private JTextField txtCampoNum1;
	private JTextField btnCampoNum2;

	/**
	 * Create the frame.
	 */
	public void VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		setTitle("Ventana Operaciones");
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public VentanaPrincipal() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERACIONES MATEMATICAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 22, 243, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnResta = new JButton("RESTA");
		btnResta.setBounds(115, 174, 96, 23);
		getContentPane().add(btnResta);
		
		JButton btnMultiplicacion = new JButton("MULTIPLI");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplicacion.setBounds(221, 174, 96, 23);
		getContentPane().add(btnMultiplicacion);
		
		JButton btnSuma = new JButton("SUMA");
		btnSuma.setBounds(9, 174, 96, 23);
		getContentPane().add(btnSuma);
		
		JButton btnDivision = new JButton("DIVISION");
		btnDivision.setBounds(327, 174, 96, 23);
		getContentPane().add(btnDivision);
		
		JLabel lblLa = new JLabel("La division es : ");
		lblLa.setBounds(10, 219, 155, 14);
		getContentPane().add(lblLa);
		
		JLabel lblNum1 = new JLabel("Numero 1:");
		lblNum1.setBounds(21, 91, 55, 14);
		getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Numero 2:");
		lblNum2.setBounds(21, 136, 55, 14);
		getContentPane().add(lblNum2);
		
		JLabel lblLa_1_2 = new JLabel("Bienvenido, a la calculadora, por favor ingrese los datos que desea calcular.");
		lblLa_1_2.setBounds(32, 47, 380, 14);
		getContentPane().add(lblLa_1_2);
		
		txtCampoNum1 = new JTextField();
		txtCampoNum1.setBounds(86, 88, 313, 20);
		getContentPane().add(txtCampoNum1);
		txtCampoNum1.setColumns(10);
		
		btnCampoNum2 = new JTextField();
		btnCampoNum2.setColumns(10);
		btnCampoNum2.setBounds(86, 133, 313, 20);
		getContentPane().add(btnCampoNum2);
	}
}
