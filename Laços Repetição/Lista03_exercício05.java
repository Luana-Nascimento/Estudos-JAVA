package exerciciosLacosRepeticao;

import java.util.Scanner;

public class Lista03_exercício05 {

	public static void main(String[] args) {
     int numero = 0, soma=0; 
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				soma += numero;}
			} while (numero != 0);
		
		leia.close();
		System.out.println("A soma dos números positivos é:" + soma);
	}
}