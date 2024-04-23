package exerciciosVariaveisOperadores;

import java.util.Scanner;

public class Lista01_exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float salario;
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		Scanner leiaAbono = new Scanner (System.in);
		float abono;
		System.out.println("Digite o Abono: ");
		abono = leiaAbono.nextFloat();
		
		float novoSalario = salario + abono;
		leia.close();
		
		System.out.printf("\nO novo salário é R$: %.2f", novoSalario);
	}
}
