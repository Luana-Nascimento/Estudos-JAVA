package exerciciosLacosCondicionais;

import java.util.Scanner;

public class Lista01_exercicio02 {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		leia.close();
		
		if (numero %2 == 0 && numero <0) {
			System.out.println("Este número é par e negativo!");
		} else if (numero %2 == 0 && numero >0) {
			System.out.println("Este número é par e positivo!");
		} else if (numero %2 == 1 && numero >0) {
			System.out.println("Este número é ímpar e positivo!");
		} else {
			System.out.println("Este número é ímpar e negativo!");
		}
	}
}
