package banco;

import javax.swing.JOptionPane;

public class Login {
	
	public static void main(String[] args) throws InterruptedException{
		
		String agency = "";
		String account = "";
		String password = "";
		String accountEntry = "";
		String agencyEntry = "";
		String passwordEntry = "";
		int i, d = 0, x = 0;
		char c = 0;
		
		while (true) {
		String[] login = {"Entrar", "Inscrever-se"};
		int loginEntry = JOptionPane.showOptionDialog( null, 
														"Escolha uma das opções: ", 
														"LOGIN.", 
														JOptionPane.YES_NO_OPTION, 
														3, 
														null,
														login,
														login[1]);
			
		if (loginEntry == 0) {
			
			while (x == 0) {
				agencyEntry = JOptionPane.showInputDialog("Digite sua agencia:", "XXXXX");
				if (!agencyEntry.equals(agency)) {
					JOptionPane.showMessageDialog(null, "Agencia incorreta, tente novamente.");
					x = 0;
				}else {
					x = 1;
			}}
			
			while (x == 0) {
				accountEntry = JOptionPane.showInputDialog("Digite sua conta:", "XXXXX");
				if (!accountEntry.equals(account)) {
					JOptionPane.showMessageDialog(null, "Conta incorreta, tente novamente.");
					x = 0;
				}else {
					x = 1;
			}}
			
			while (((agencyEntry.equals(agency)) && (accountEntry.equals(account)))) {
				passwordEntry = JOptionPane.showInputDialog("CONTA: " + accountEntry + " | AGENCIA: " + agencyEntry + "\nInforme sua senha de 4 digitos: ", "XXXX");
				if (!passwordEntry.equals(password)) {
					JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente.");
				}else {		
					passwordEntry = password;
					x = 1;
			}}
			
		}else {
			
			while (agency.isEmpty()) {
				agencyEntry = JOptionPane.showInputDialog("Cadastre sua agencia:", "XXXXXX");
				for (i = 0; i < agencyEntry.length(); i++) {
					c = agencyEntry.charAt(i);
				if (Character.isLetter(c)){
						d = 1;
				}}if ((d == 1) || (agencyEntry.length() <= 5) || (agencyEntry.length() > 6) || (agencyEntry.isBlank()) || (agencyEntry.isEmpty())) {
					JOptionPane.showMessageDialog(null, "O numero da agencia contem 6 digitos, tente novamente.");
					d = 0;
				}else {
					agency = agencyEntry;
			}}
			
			while ((account.isEmpty())) {
				accountEntry = JOptionPane.showInputDialog("Cadastre sua conta:", "XXXXX");
				for (i = 0; i < accountEntry.length(); i++) {
					c = accountEntry.charAt(i);
				if (Character.isLetter(c)) {
					d = 1;
				}}if ((d == 1) || (accountEntry.length() <= 4) || (accountEntry.length() > 5) || (accountEntry.isBlank()) || (accountEntry.isEmpty())) {
					JOptionPane.showMessageDialog(null,"O numero da agencia contem 5 numeros, tente novamente.");
					d = 0;
				}else {
					account = accountEntry;
			}}
			
			while (password.isEmpty()) {
				passwordEntry = JOptionPane.showInputDialog("CONTA: " + account + " | AGENCIA: " + agency + "\nCadastre sua senha de 4 digitos: ", "XXXX");
				for (i = 0; i < passwordEntry.length(); i++) {
					c = passwordEntry.charAt(i);
				if (Character.isLetter(c)){
					d = 1;
				}}if ((d == 1) || (passwordEntry.length() <= 3) || (passwordEntry.length() > 4) || (passwordEntry.isBlank()) || (passwordEntry.isEmpty())) {
					JOptionPane.showMessageDialog(null, "A senha deve conter 4 numeros, tente novamente.");
					d = 0;
				}else {
					password = passwordEntry;
					JOptionPane.showMessageDialog(null, "CONTA: " + account + " | AGENCIA: " + agency + "\nRegistrado com sucesso!");
			}}
		}
		}
	}
}