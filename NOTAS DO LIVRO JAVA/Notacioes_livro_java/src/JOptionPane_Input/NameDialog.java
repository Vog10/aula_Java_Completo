package JOptionPane_Input;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		
		
		// pede para o usuario inserir seu nome
		String name =  JOptionPane.showInputDialog("Whats is your name?");
		
		// cria mensagem = um metodo ou funcao que é criado que vai ser chamado na proxima linha.
		String message = String.format("Welcome, %s, to java Programming!", name);
						 // imprimi uma String formatada!
		
		//exibe a mensagem para cruprimentar o usario pelo nome
		JOptionPane.showMessageDialog(null, message);
		
	}// fim do main

} // teermina NameDialog
