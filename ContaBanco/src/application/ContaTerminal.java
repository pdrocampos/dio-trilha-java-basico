package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String usuario;
		int numero = 1021;
		String agencia = "067-8";
		String NomeCliente = "Mario Andrade";
		double saldo = 237.48;
		 
		System.out.println("Por favor, digite o número da Agência !");
		System.out.print("Agencia: ");
		usuario = sc.nextLine();
		if(usuario.equals(agencia)) {
			System.out.println("Olá " + NomeCliente + ", obrigado por criar"
					+ " uma conta em nosso banco, sua agência é " + agencia + ","
					+ " conta " + numero + " e seu saldo " + saldo + "R$ já está disponível "
					+ "para saque.");
		}else {
			System.out.println("Agencia desconhecida!");
		}
		
		sc.close();
	}
		
}
