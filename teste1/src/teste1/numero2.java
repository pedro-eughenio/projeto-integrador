package teste1;
import java.util.Scanner;

public class numero2 {
	
	public static void main(String[] args) {
		
		
		int dianasc = 0;
		int mesnasc = 0;
		int anonasc = 0;
		
		
		System.out.println("Digite sua data de nascimento para confirmação de idade.");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia do seu nascimento.");
		dianasc = entrada.nextInt();
		System.out.println("Digite o mes do seu nascimento.");
		mesnasc = entrada.nextInt();
		System.out.println("Digite o ano do seu nascimento.");
		anonasc = entrada.nextInt();
		
		if(dianasc < 20 && mesnasc <= 9 && anonasc < (2024 - anonasc)) {
			System.out.println("Voce é menor de idade.");
		}else {
			System.out.println("Voce é maior de idade.");
		}
		
		entrada.close();
		
		
	}

}
