package exerciciosLacosCondicionais;

import java.util.Scanner;

public class Lista01_exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
        boolean primeiraDoacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		leia.close();
		
		if ( idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apto(a) para doar sangue");
	} else if (idade >= 18 && idade <= 60) {
		System.out.println(nome + " está apto(a) para doar sangue");
	} else {
		System.out.println(nome + " não está apto(a) para doar sangue");
	}
  }
}
