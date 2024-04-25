package exerciciosVetores;

import java.util.Scanner;

public class Lista01_exercicio01 {

	public static void main(String[] args) {
		
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; 
		int numeroDigitado; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja encontrar: ");
		numeroDigitado = leia.nextInt(); 
		
		boolean encontrado = false;
		
		for(int indice = 0; indice < numeros.length; indice++) {
			if (numeros[indice] == numeroDigitado) {
				System.out.println("O número "+numeroDigitado+" está localizado na posição: " +indice);
				encontrado = true;
				break;}
			
		} if (!encontrado) {
		System.out.println("O número "+numeroDigitado+ " não foi encontrado!");}
		leia.close();

}
	}
