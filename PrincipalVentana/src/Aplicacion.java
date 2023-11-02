import javax.swing.JOptionPane;

import clases.OperacionesMatematicas;

public class Aplicacion {
	
 OperacionesMatematicas misOperaciones;
 
 public Aplicacion() {
	 
	 misOperaciones = new OperacionesMatematicas();
	 
	 //presentarMenu();
	 presentarVentana();
 }
 private void presentarVentana() {
	 VentanaPrincipal miVentana = new VentanaPrincipal();
	 miVentana.setVisible(true);
	
}
private void presentarMenu() {
	 String menu="Operaciones Matematicas\n";
	 menu+="1. Sumar\n";
	 menu+="2. Restar\n";
	 menu+="3. Multiplicar\n";
	 menu+="4. Dividir\n";
	 menu+="5. Restar\n";
	 menu+="Ingrese una opción\n";
	 
	 int cod = 0;
	 
	 do {
		 int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
		 int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
	     
		 cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
		 
		 switch(cod) {
		 case 1:
			 int resp = misOperaciones.sumar(num1, num2);
			 JOptionPane.showMessageDialog(null, "La suma" + resp);
			 break;
		 case 2:
			 int rest = misOperaciones.restar(num1, num2);
			 JOptionPane.showMessageDialog(null, "La resta" + rest);
			 break;
		 case 3:
			 int mult = misOperaciones.multiplicar(num1, num2);
			 JOptionPane.showMessageDialog(null, "La multiplicacion" + mult);
			 break;
		 case 4:
			 String div = misOperaciones.dividir(num1, num2);
			 JOptionPane.showMessageDialog(null, div);
			 break;
		 case 5:
			 
			 JOptionPane.showMessageDialog(null, "Hasta pronto");
			 break;

         default:
			 
			 JOptionPane.showMessageDialog(null, "Ingrese un dato valido");
			 break;
		 }
	 }while(cod != 5);
   }
}
		 