package exerciciosVariaveisOperadores;

import java.util.Scanner;

public class Lista01_exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float nota1;
		System.out.println("Digite Nota 1: ");
		nota1 = leia.nextFloat();
		
		Scanner leianota2 = new Scanner (System.in);
		float nota2;
		System.out.println("Digite Nota 2: ");
		nota2 = leianota2.nextFloat();
		
		Scanner leianota3 = new Scanner (System.in);
		float nota3;
		System.out.println("Digite Nota 3: ");
		nota3 = leianota3.nextFloat();
		
		Scanner leianota4 = new Scanner (System.in);
		float nota4;
		System.out.println("Digite Nota 4: ");
		nota4 = leianota4.nextFloat();
		
		float mediafinal = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("\nA média final do participante é: %.1f", mediafinal);

	}

}
