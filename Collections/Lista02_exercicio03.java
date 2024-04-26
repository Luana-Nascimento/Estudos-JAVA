package exerciciosCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lista02_exercicio03 {
	public static void main(String[] args) {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner leia = new Scanner (System.in); 
		
		for(int contador = 0; contador <10; contador++){
		System.out.println("Digite um número: ");
		valores.add(leia.nextInt()); 
}
		for(int dados : valores) {			
		}
		System.out.println("Lista de valores digitados: " );
		
        Iterator <Integer> ivalores = valores.iterator();
		
		while(ivalores.hasNext()) {
		System.out.println(ivalores.next());
		}
	leia.close();
}
	}