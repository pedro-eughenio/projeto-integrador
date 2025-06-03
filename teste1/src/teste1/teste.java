package teste1;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
System.out.println("Digite sua idade para verificação de maioridade.");
		
		Scanner idade = new Scanner(System.in);
		
		int idd = idade.nextInt();
		
		if(idd >= 18){
		    System.out.println("Você é maior de idade.");
		}else{
		    System.out.println("Você é menor de idade.");
		}
	}
}
