package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Instanciamos una clase | Ejemplarizar una clase */
		Coche micoche = new Coche();
		
		micoche.setColor(JOptionPane.showInputDialog("Introduce Color"));
		
		System.out.println(micoche.getColor());
		
		System.out.println(micoche.getDatosG());
		
		micoche.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?: "));
		
		System.out.println(micoche.getAsientos());
		
		micoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?: "));
		
		System.out.println(micoche.getClimatizador());
		
		System.out.println(micoche.getPesoCoche());
		
		System.out.println("El precio final del coche es: " + micoche.getPrecio_coche());

	}

}
