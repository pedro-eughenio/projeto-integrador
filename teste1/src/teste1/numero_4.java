package teste1;
import java.util.Scanner;

public class numero_4 {
	
	public static void main(String[] args) {
		
		int tentlimite = 3;
		int tentativa = 0;
		int i = 3;
		int pin = 1234;
		int tentpin = 0;
		
		do {
		
		System.out.println("Digite sua senha para liberação.");
		Scanner senha = new Scanner(System.in);
		tentpin = senha.nextInt();
		
		if(pin == tentpin) {
			System.out.println("Acesso liberado");
			break;
		}else {
			tentativa ++;
			i --;
			if(tentativa < tentlimite) {
				System.out.println("Senha incorreta. Tentativas restantes: " + i);
		}else {
			System.out.println("Senha incorreta. Tentativas excedidas.");
		}
		}
			
		}while(tentlimite > tentativa);
		
		
		
	}
}
