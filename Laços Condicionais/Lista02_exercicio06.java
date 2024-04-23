package exerciciosLacosCondicionais;

import java.util.Scanner;

public class Lista02_exercicio06 {
	
	public static final int GERENTE = 1;
    public static final int VENDEDOR = 2;
    public static final int SUPERVISOR = 3;
    public static final int MOTORISTA = 4;
    public static final int ESTOQUISTA = 5;
    public static final int TECNICO_TI = 6;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int cargo;
        String nome;
        float salario;

        System.out.println("\nPor favor, digite o nome do colaborador: ");
        nome = leia.nextLine();

        System.out.println("Selecione uma opção:");
        System.out.println("*** 1 - Gerente ***");
        System.out.println("*** 2 - Vendedor ***");
        System.out.println("*** 3 - Supervisor ***");
        System.out.println("*** 4 - Motorista ***");
        System.out.println("*** 5 - Estoquista ***");
        System.out.println("*** 6 - Técnico de TI ***");

        System.out.println("\nPor favor, digite o código do cargo: ");
        cargo = leia.nextInt();

        System.out.println("\nPor favor, digite o salário atual do colaborador: ");
        salario = leia.nextFloat();

        leia.close();

        float novoSalario = 0;

        switch (cargo) {
            case GERENTE:
                novoSalario = salario + (0.1f * salario);
                System.out.printf("O colaborador " + nome + ", gerente, terá seu salário ajustado para R$ %.2f%n", novoSalario);
                break;
            case VENDEDOR:
                novoSalario = salario + (0.07f * salario); 
                System.out.printf("O colaborador " + nome + ", terá seu salário ajustado para R$ %.2f%n", novoSalario);
                break;
            case SUPERVISOR:
                novoSalario = salario + (0.09f * salario); 
                System.out.printf("O colaborador " + nome + ", supervisor, terá seu salário ajustado para R$ %.2f%n", novoSalario);
                break;
            case MOTORISTA:
                novoSalario = salario + (0.06f * salario);
                System.out.printf("O colaborador " + nome + ", motorista, terá seu salário ajustado para R$ %.2f%n", novoSalario);
                break;
            case ESTOQUISTA:
                novoSalario = salario + (0.05f * salario); 
                System.out.printf("O colaborador " + nome + ", estoquista, terá seu salário ajustado para R$ %.2f%n", novoSalario);
                break;
            case TECNICO_TI:
                novoSalario = salario + (0.08f * salario); 
                System.out.printf("O colaborador " + nome + ", técnico de TI, terá seu salário ajustado para R$ %.2f%n", novoSalario);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
