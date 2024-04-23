package exerciciosLacosCondicionais;

import java.util.Scanner;

public class Lista01_exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, resultado;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		leia.close();
		
		resultado = a + b; 
		
		
		if(resultado > c) {
        System.out.println("A soma de A + B é Maior do que C");
        } else if(resultado < c){
                System.out.println("A soma de A + B é Menor do que C");
		} else {
		System.out.println("A soma de A + B é Igual a C");
		}	
	}
}
