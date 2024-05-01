package exerciciosEstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_Exercicio01 {

    public static void main(String[] args) {
        
        Queue<String> filaClientes = new LinkedList<String>();
        Scanner leia = new Scanner(System.in); 
        int opcao;
        
        System.out.println("Menu: ");
        System.out.println("\n1 - Adicionar Cliente na Fila");
        System.out.println("2 - Listar todos os Clientes");
        System.out.println("3 - Limpar a Fila");
        System.out.println("0 - Sair");
        System.out.println("\nDigite uma opção: ");
        
        do {
            opcao = leia.nextInt();
            
            switch(opcao) {
                case 1: 
                    System.out.println("Digite o nome do Cliente: ");
                    leia.nextLine(); // Limpar o buffer do teclado
                    String nomeCliente = leia.nextLine();
                    filaClientes.offer(nomeCliente);
                    System.out.println("Cliente adicionado! ");
                    break; 
                
                case 2: 
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        System.out.println("\nLista de Clientes na Fila:");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("\nCliente chamado: " + clienteChamado);
                    }
                    break;
                
                case 0: 
                    System.out.println("Programa Finalizado!");
                    break;
                
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        
        leia.close();
    }
}