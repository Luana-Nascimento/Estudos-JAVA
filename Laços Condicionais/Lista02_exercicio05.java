package exerciciosLacosCondicionais;

import java.util.Scanner;

public class Lista02_exercicio05 {
	
	public static final int cachorroQuente = 1;
    public static final int xSalada = 2;
    public static final int xBacon= 3;
    public static final int bauru = 4;
    public static final int refrigerante = 5;
    public static final int sucoLaranja = 6;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int produto; 
        float quantidade;

        System.out.println("Selecione uma opção:");
        System.out.println("*** 1 - Cachorro Quente ***");
        System.out.println("*** 2 - X-Salada ***");
        System.out.println("*** 3 - X-Bacon ***");
        System.out.println("*** 4 - Bauru ***");
        System.out.println("*** 5 - Refrigerante ***");
        System.out.println("*** 6 - Suco de Laranja ***");

        System.out.printf("\nPor favor, digite o código do produto: ");
        produto = leia.nextInt();

        System.out.printf("\nPor favor, digite a quantidade: ");
        quantidade = leia.nextFloat();
        leia.close();
        
        float valorTotal = 0;

        switch (produto) {
            case cachorroQuente:
            	valorTotal = (10.00f * quantidade); 
                System.out.printf("Produto Cachorro Quente, no valor total de R$ %.2f%n", valorTotal);
                break;
            case xSalada:
            	valorTotal = (15.00f * quantidade); 
                System.out.printf("Produto X-Salada, no valor total de R$ %.2f%n", valorTotal);
                break;
            case xBacon:
            	valorTotal = (18.00f * quantidade); 
                System.out.printf("Produto X-Bacon, no valor total de R$ %.2f%n", valorTotal);
                break;
            case bauru:
            	valorTotal = (12.00f * quantidade); 
                System.out.printf("Produto Bauru, no valor total de R$ %.2f%n", valorTotal);
                break;
            case refrigerante:
            	valorTotal = (8.00f * quantidade); 
                System.out.printf("Produto refrigerante, no valor total de R$ %.2f%n", valorTotal);
                break;
            case sucoLaranja:
            	valorTotal = (13.00f * quantidade); 
                System.out.printf("Produto suco de laranja, no valor total de R$ %.2f%n", valorTotal);
                break;
            default:
                System.out.printf("Código de produto inválido.");
        }
    }
}
