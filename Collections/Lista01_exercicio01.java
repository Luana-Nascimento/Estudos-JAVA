package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01_exercicio01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner (System.in); 
		
		for(int contador = 0; contador <5; contador++){
		System.out.println("Digite uma cor: ");
		 cores.add(leia.nextLine()); 
}
	
	System.out.println("Lista de cores adicionadas: "+ cores);
	
	cores.sort(null);
	
	System.out.println("Lista ordenada em ordem crescente: " + cores);
	
	leia.close();
}
	}
