package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Lista01_exercicio01 {

	public static void main(String[] args) {
int num1, num2;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número do intervalo:");
		num1 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo:");
		num2 = leia.nextInt();
		
		leia.close();
		
		if (num1 > num2) {
			System.out.println("O intervalo é inválido.");
			return;}
		
		System.out.println("No intervalo entre " + num1 + " e " + num2 +":" );
		for (int multiplos = num1; multiplos <= num2; multiplos++) {
			if (multiplos % 3 == 0 && multiplos % 5 == 0) {
				System.out.println(multiplos + " é múltiplo de 3 e 5");
			}		
		}
	}
}
