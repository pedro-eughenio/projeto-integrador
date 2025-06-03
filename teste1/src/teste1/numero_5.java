package teste1;
import java.util.Scanner;

public class numero_5 {
	
	public static void main(String[] args) {
		
		int diaesc = 0;
		
		System.out.println("Digite um numero de [1] a [7] para representar o seu dia favorito da semana.");
		Scanner entrada = new Scanner(System.in);
		diaesc = entrada.nextInt();
		if(diaesc > 7) {
			System.out.println("Espertinho... Escreve a poha do numero igual pede o enunciado. :)");
		}
		
		switch(diaesc) {
		case 1:
			System.out.println("Voce escolheu domingo. :)");
			break;
		case 2:
			System.out.println("Voce escolheu segunda. Desculpa mas você é infeliz, vai se tratar. :(");
			break;
		case 3:
			System.out.println("Voce escolheu terça. :)");
			break;
		case 4:
			System.out.println("Voce escolheu quarta. :)");
			break;
		case 5:
			System.out.println("Voce escolheu quinta. :)");
			break;
		case 6:
			System.out.println("Voce escolheu sexta. Você tem um bom gosto em meu chapa. :)");
			break;
		case 7:
			System.out.println("Voce escolheu sábado. Descansar né? Que o pai não é de ferro.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
