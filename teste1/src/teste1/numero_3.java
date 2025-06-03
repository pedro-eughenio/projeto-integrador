package teste1;
import java.util.Scanner;

public class numero_3 {
	
	public static void main(String[] args) {
		
		int pin = 1234;
		int tentpin = 0;
		
		do {
		
		System.out.println("Digite sua senha para liberação.");
		Scanner senha = new Scanner(System.in);
		
		tentpin = senha.nextInt();
		
		if(pin == tentpin) {
			System.out.println("Acesso liberado");
		}else {
			System.out.println("Senha incorreta, tente novamente.");
		}
		
		}while(tentpin != pin);
		
		
	}
}
