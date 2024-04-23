package exerciciosVariaveisOperadores;

import java.util.Scanner;

public class Lista01_exercicio04 {

	public static void main(String[] args) {
		Scanner leian1 = new Scanner (System.in);
		float n1;
		System.out.println("número 1: ");
		n1 = leian1.nextFloat();
		
		Scanner leian2 = new Scanner (System.in);
		float n2;
		System.out.println("número 2: ");
		n2 = leian2.nextFloat();
		
		Scanner leian3 = new Scanner (System.in);
		float n3;
		System.out.println("número 3: ");
		n3 = leian3.nextFloat();
		
		Scanner leian4 = new Scanner (System.in);
		float n4;
		System.out.println("número 4: ");
		n4 = leian4.nextFloat();
		
		float Diferenca = (n1 * n2) - (n3 * n4) ;
		System.out.printf("\nA diferença entre os produtos n1 e n2 sobre os produtos n3 e n4 é: %.1f", Diferenca);
	}
}
