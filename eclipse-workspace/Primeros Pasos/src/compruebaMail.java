import javax.swing.*;

public class compruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba = false;
		
		String mail = JOptionPane.showInputDialog("Introduce correo: ");
		
		for (int i = 0; i < mail.length(); i++){
			
			//Al comparar datos tipo char, siempre van en comillas simples
			if (mail.charAt(i) == '@') {
				arroba = true;
			}
			
		}
		
		if (arroba == true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}

	}

}
