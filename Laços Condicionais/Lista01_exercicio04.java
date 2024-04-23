package exerciciosLacosCondicionais;

import java.util.Scanner;

public class Lista01_exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String caracteristica1;
		String caracteristica2;
		String caracteristica3;
		
		System.out.println("Digite a característica 1: ");
		caracteristica1 = leia.nextLine();
		
		System.out.println("Digite a característica 2: ");
		caracteristica2 = leia.nextLine();
		
		System.out.println("Digite a característica 3: ");
		caracteristica3 = leia.nextLine();

        leia.close();
                
        if (caracteristica1.equalsIgnoreCase("Vertebrado") && caracteristica2.equalsIgnoreCase("Ave") && caracteristica3.equalsIgnoreCase("Carnívoro")) {
            System.out.println("Águia");
        } else if (caracteristica1.equalsIgnoreCase("Vertebrado") && caracteristica2.equalsIgnoreCase("Ave") && caracteristica3.equalsIgnoreCase("Onívoro")) {
        	System.out.println("Pomba");;
        } else if (caracteristica1.equalsIgnoreCase("Vertebrado") && caracteristica2.equalsIgnoreCase("Mamífero") && caracteristica3.equalsIgnoreCase("Onívoro")) {
        	System.out.println("Homem");
        } else if (caracteristica1.equalsIgnoreCase("Vertebrado") && caracteristica2.equalsIgnoreCase("Mamífero") && caracteristica3.equalsIgnoreCase("Herbívoro")) {
        	System.out.println("Vaca");
        } else if (caracteristica1.equalsIgnoreCase("Invertebrado") && caracteristica2.equalsIgnoreCase("Inseto") && caracteristica3.equalsIgnoreCase("Hematófago")) {
            	System.out.println("Pulga");;
        } else if (caracteristica1.equalsIgnoreCase("Invertebrado") && caracteristica2.equalsIgnoreCase("Inseto") && caracteristica3.equalsIgnoreCase("Herbívoro")) {
            	System.out.println("Lagarta");
        } else if (caracteristica1.equalsIgnoreCase("Invertebrado") && caracteristica2.equalsIgnoreCase("Anelídeo") && caracteristica3.equalsIgnoreCase("Hematófago")) {
            	System.out.println("Sanguessuga");
        } else if (caracteristica1.equalsIgnoreCase("Invertebrado") && caracteristica2.equalsIgnoreCase("Anelídeo") && caracteristica3.equalsIgnoreCase("Onívoro")) {
        	System.out.println("Minhoca");
        } else {
        	System.out.println("Animal não identificado"); }}}
