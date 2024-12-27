package banco;

import javax.swing.JOptionPane;

public class ContaCorrente {

	public static void main(String[] args) throws InterruptedException{
		
		double balance = 0;
		double depositDouble = 0;
		double withdrawDouble = 0;
		int generalMenu = 0;	
										//O PROGRAMA NAO FECHA EM DEFINITIVO QUANDO CLICA EM SAIR, NEM DA PRA ENTRAR EM NENHUMA OUTRA OPÇAO
			String agency = "";
			String account = "";
			String password = "";

			int d = 0;
			char c = 0;
			
			while (true) {
			String[] login = {"Entrar", "Inscrever-se"};
			int loginEntry = JOptionPane.showOptionDialog(null, "Escolha uma das opções: ", "LOGIN.", JOptionPane.DEFAULT_OPTION, 3, null, login, login[1]);
			boolean agencyTry = false;
			boolean accountTry = false;
			boolean passwordTry = false;
			String accountEntry = "";
			String agencyEntry = "";
			String passwordEntry = "";
				
			if (loginEntry == 1) {
				
				while (agencyTry == false)  {
					agencyEntry = JOptionPane.showInputDialog("Cadastre sua agencia:", "XXXXXX");
					for (int i = 0; i < agencyEntry.length(); i++) {
						c = agencyEntry.charAt(i);
					if (Character.isLetter(c)){
							d = 1;
					}}if ((d == 1) || (agencyEntry.length() <= 5) || (agencyEntry.length() > 6) || (agencyEntry.isBlank()) || (agencyEntry.isEmpty())) {
						JOptionPane.showMessageDialog(null, "O numero da agencia contem 6 digitos, tente novamente.");
						d = 0;
					}else {
						agency = agencyEntry;
						agencyTry = true;
				}}
				
				while (accountTry == false) {
					accountEntry = JOptionPane.showInputDialog("Cadastre sua conta:", "XXXXX");
					d = 0;
					for (int i = 0; i < accountEntry.length(); i++) {
						c = accountEntry.charAt(i);
					if (Character.isLetter(c)) {
						d = 1;
					}}if ((d == 1) || (accountEntry.length() <= 4) || (accountEntry.length() > 5) || (accountEntry.isBlank()) || (accountEntry.isEmpty())) {
						JOptionPane.showMessageDialog(null,"O numero da agencia contem 5 numeros, tente novamente.");
						d = 0;
					}else {
						account = accountEntry;
						accountTry = true;
				}}
				
				while (passwordTry == false) {
					passwordEntry = JOptionPane.showInputDialog("CONTA: " + account + " | AGENCIA: " + agency + "\nCadastre sua senha de 4 digitos: ", "XXXX");
					d = 0;
					for (int i = 0; i < passwordEntry.length(); i++) {
						c = passwordEntry.charAt(i);
					if (Character.isLetter(c)){
						d = 1;
					}}if ((d == 1) || (passwordEntry.length() <= 3) || (passwordEntry.length() > 4) || (passwordEntry.isBlank()) || (passwordEntry.isEmpty())) {
						JOptionPane.showMessageDialog(null, "A senha deve conter 4 numeros, tente novamente.");
						d = 0;
					}else {
						password = passwordEntry;
						passwordTry = true;
						JOptionPane.showMessageDialog(null, "CONTA: " + account + " | AGENCIA: " + agency + "\nRegistrado com sucesso!");
				}}
			}

			if (loginEntry == 0) {
				
				while (!agencyEntry.isBlank()) {
					agencyEntry = JOptionPane.showInputDialog("Digite sua agencia: ", "XXXXX");
					if (!agencyEntry.equals(agency)) {
						JOptionPane.showMessageDialog(null, "Agencia incorreta, tente novamente.");
						agencyEntry = "";
					}else {
						
				}}
				
				while (!accountEntry.isBlank()) {
					accountEntry = JOptionPane.showInputDialog("Digite sua conta:", "XXXXX");
					if (!accountEntry.equals(account)) {
						JOptionPane.showMessageDialog(null, "Conta incorreta, tente novamente.");
						accountEntry = "";
					}else {
						
				}}
				
				while (!password.isBlank()) {
					passwordEntry = JOptionPane.showInputDialog("CONTA: " + accountEntry + " | AGENCIA: " + agencyEntry + "\nInforme sua senha de 4 digitos: ", "XXXX");
					if (!passwordEntry.equals(password)) {
						JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente.");
					}else {		
						passwordEntry = password;
				}}
				
			}
			
		if (passwordEntry == password) {

		while (generalMenu != 4)  {	
		String[] menu = {"Saldo", "Saque", "Deposito", "Extrato", "Sair"};
		generalMenu = JOptionPane.showOptionDialog(null,"MENU", "CONTA: " + accountEntry + "| AGENCIA: " + agencyEntry, 0, 3, null, menu, menu[0]);
		
			if (generalMenu == 0) {
				JOptionPane.showMessageDialog(null, "Seu saldo é: R$" + String.format("%.2f", balance));
			}
			
			if (generalMenu == 1) {
				while (generalMenu == 1) {
				String withdrawEntry = JOptionPane.showInputDialog("Voce tem disponivel para saque: R$" + String.format("%.2f", balance) + "\nInforme o valor do saque: ");
				withdrawDouble= Double.parseDouble(withdrawEntry);
				if (withdrawDouble > balance) {
					JOptionPane.showMessageDialog(null, "Valor do saque maior que o disponivel em conta \n Saldo em conta R$:" + String.format("%.2f", balance));
				}else {
					balance = (balance - withdrawDouble);
					generalMenu = 0;
				}
			}}
			
			if (generalMenu == 2) {
				while (generalMenu == 2) {
				String depositEntry = JOptionPane.showInputDialog("Seu saldo é: R$" + String.format("%.2f", balance) + "\nInforme o valor do deposito: ");
				depositDouble = Double.parseDouble(depositEntry);
				if (depositDouble <= 0) { 
					JOptionPane.showMessageDialog(null, "O valor do deposito deve ser maior que 0,0 (zero).");
				}else {
					balance = (balance + depositDouble);
					generalMenu = 0;
				}
			}}
			
			if (generalMenu == 3) {
				JOptionPane.showMessageDialog(null,"Seu saldo é: R$" + String.format("%.2f", balance) + "\nSeu ultimo saque foi de: R$" + String.format("%.2f", withdrawDouble) +
					"\nSeu ultimo deposito foi de: R$" + String.format("%.2f", depositDouble));
			}
			
			if (generalMenu == 4) {
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso banco!");
				break;
			}
		}
	}
}}}