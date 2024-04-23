package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Lista02_exercicio03 {

	public static void main(String[] args) {
		int idade = 0, contador1=0, contador2=0; 
		
		Scanner leia = new Scanner (System.in);
		
		while (idade >= 0) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
			
			if(idade >= 1 && idade < 21) {
				contador1++;
			}else if (idade > 50) {
				contador2++;
			}
		
		}
		leia.close();
		System.out.println("Total de pessoas menores que 21 anos:" + contador1);
		System.out.println("Total de pessoas menores que 50 anos:" + contador2);
	}

}
