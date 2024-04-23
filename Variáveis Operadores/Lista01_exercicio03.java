package exerciciosVariaveisOperadores;

import java.util.Scanner;

public class Lista01_exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float SalarioBruno;
		System.out.println("Digite o salário: ");
		SalarioBruno = leia.nextFloat();
		
		Scanner leiaAdicionalNoturno = new Scanner (System.in);
		float AdicionalNoturno;
		System.out.println("Digite o adicional noturno: ");
		AdicionalNoturno = leiaAdicionalNoturno.nextFloat();
		
		Scanner leiaHorasExtras = new Scanner (System.in);
		float HorasExtras;
		System.out.println("Digite as horas extras: ");
		HorasExtras = leiaHorasExtras.nextFloat();
		
		Scanner leiaDescontos = new Scanner (System.in);
		float Descontos;
		System.out.println("Digite os descontos: ");
		Descontos = leiaDescontos.nextFloat();
		
		float SalarioLiquido = (SalarioBruno + AdicionalNoturno + (HorasExtras* 5) - Descontos);
		System.out.printf("\nO salário líquido do colaborador é R$: %.2f", SalarioLiquido);
}
}
