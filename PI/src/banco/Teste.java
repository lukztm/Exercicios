package banco;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) throws InterruptedException{

		String agency = "0";
		String account = "0";
		String password = "0";
		String accountEntry = "";
		String agencyEntry = "";
		String passwordEntry = "";
		int i, d = 0;
		int b = 0;
		char c = 0;
		
		while (!agencyEntry.equals(agency)) {
			agencyEntry = JOptionPane.showInputDialog("Cadastre sua agencia:", "XXXXXX");
			for (i = 0; i < agencyEntry.length(); i++) {
				c = agencyEntry.charAt(i);
			}if ((Character.isLetter(c)) || (agencyEntry.length() <= 5) || (agencyEntry.length() > 6) || (agencyEntry.isBlank()) || (agencyEntry.isEmpty())) {
				JOptionPane.showMessageDialog(null, "O numero da agencia contem 6 digitos, tente novamente.");
			}else {
				agency = agencyEntry;
		}}
	}
}
